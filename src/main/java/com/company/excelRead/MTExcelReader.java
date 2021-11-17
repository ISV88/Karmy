package com.company.excelRead;

import com.company.Customer;
import com.company.ExamplePartOf;
import com.company.SalesManager;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.*;

import static com.company.Main.salesManagerSet;
import static java.nio.file.StandardWatchEventKinds.*;

public class MTExcelReader {


    public MTExcelReader() {
    }


    private static SalesManager salesManagerFactory(String e) {
        for (SalesManager a : salesManagerSet) {
            if (a.getName().equals(e)) return a;
        }
        return new SalesManager(e);
    }

    private static Customer customerFactory(SalesManager salesManager, String c) {

        for (Customer a : salesManager.customers) {
            if (a.getName().equals(c)) return a;
        }
        return new Customer(c);
    }

    public static void getData() throws IOException, InterruptedException {

        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path path = Paths.get("C:\\Users\\ignat_000\\Desktop\\Пример");
        path.register(watchService, ENTRY_CREATE);

        boolean poll = true;
        while (poll) {
            WatchKey key = watchService.take();
            for (WatchEvent<?> event : key.pollEvents()) {
                System.out.println("Event kind : " + event.kind() + " - File : " + event.context());


                FileInputStream fileInputStream = new FileInputStream(path + "\\" + event.context());

                HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
                HSSFSheet sheet = workbook.getSheetAt(0);

                for (Row row : sheet) {

                    SalesManager salesManager = salesManagerFactory(row.getCell(4).getStringCellValue());
                    Customer customer = customerFactory(salesManager, row.getCell(0).getStringCellValue());
                    ExamplePartOf examplePartOf = new ExamplePartOf(
                            row.getCell(0).getStringCellValue()
                            , row.getCell(1).getLocalDateTimeCellValue()
                            , (float) row.getCell(2).getNumericCellValue()
                            , (int) row.getCell(3).getNumericCellValue()
                            , row.getCell(4).getStringCellValue());

                    salesManagerSet.add(salesManager);
                    salesManager.customers.add(customer);
                    customer.partOfImpl.add(examplePartOf);
                }
                fileInputStream.close();
                System.out.println(salesManagerSet);
            }
            poll = key.reset();
        }
    }
}

