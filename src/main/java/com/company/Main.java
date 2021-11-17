package com.company;



import com.company.excelRead.MTExcelReader;

import java.io.IOException;
import java.util.HashSet;


public class Main {

    public static HashSet<SalesManager> salesManagerSet = new HashSet<>();

    public static void main(String[] args) throws IOException, InterruptedException {


        // запустить бесконечное считывание файла
        MTExcelReader.getData();



        // после считывания отобразить информацию
        System.out.println(salesManagerSet);


    }

}
