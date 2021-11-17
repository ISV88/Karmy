package com.company;



import java.time.LocalDateTime;
import java.util.Objects;

public class ExamplePartOf {



    private String id;
    private LocalDateTime dateOfSale;
    private float customerSalesAmount;
    private int customerDiscount;
    private String managerName;



    public ExamplePartOf(String id, LocalDateTime dateOfSale,
                         float customerSalesAmount, int customerDiscount, String managerName) {
        this.id = id;
        this.dateOfSale = dateOfSale;
        this.customerSalesAmount = customerSalesAmount;
        this.customerDiscount = customerDiscount;
        this.managerName = managerName;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(LocalDateTime dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public float getCustomerSalesAmount() {
        return customerSalesAmount;
    }

    public void setCustomerSalesAmount(float customerSalesAmount) {
        this.customerSalesAmount = customerSalesAmount;
    }

    public int getCustomerDiscount() {
        return customerDiscount;
    }

    public void setCustomerDiscount(int customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

    public String getManagerName() {return managerName;}

    public void setManagerName(String managerName) {this.managerName = managerName;}

    @Override
    public String toString() {
        return "        " + "\n" +
                "           дата: " + dateOfSale.toLocalDate() +
                ", цена продажи: " + customerSalesAmount +
                ", скидка: " + customerDiscount + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExamplePartOf that)) return false;
        return Float.compare(that.getCustomerSalesAmount(), getCustomerSalesAmount()) == 0
                && getCustomerDiscount() == that.getCustomerDiscount()
                && getId().equals(that.getId())
                && getDateOfSale().equals(that.getDateOfSale());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDateOfSale(), getCustomerSalesAmount(), getCustomerDiscount());
    }
}
