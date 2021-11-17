package com.company;

import java.time.LocalDate;

public class PartOfImplementation {

    private String id;
    private String region;
    private String managerName;
    private LocalDate dateOfSale;
    private String clientType;
    private String entity;
    private String address;
    private String supplierProductCategory;
    private String supplierSKU;
    private String nameOfProduct;
    private String setSize;
    private float packing;
    private int amount;
    private float weight;
    private float basePrice;
    private float customerSalesAmount;
    private int customerDiscount;
    private float salesAmountToDealer;
    private int dealerMarkup;
    private int postponementOfTheClient;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public LocalDate getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(LocalDate dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSupplierProductCategory() {
        return supplierProductCategory;
    }

    public void setSupplierProductCategory(String supplierProductCategory) {
        this.supplierProductCategory = supplierProductCategory;
    }

    public String getSupplierSKU() {
        return supplierSKU;
    }

    public void setSupplierSKU(String supplierSKU) {
        this.supplierSKU = supplierSKU;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getSetSize() {
        return setSize;
    }

    public void setSetSize(String setSize) {
        this.setSize = setSize;
    }

    public float getPacking() {
        return packing;
    }

    public void setPacking(float packing) {
        this.packing = packing;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
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

    public float getSalesAmountToDealer() {
        return salesAmountToDealer;
    }

    public void setSalesAmountToDealer(float salesAmountToDealer) {
        this.salesAmountToDealer = salesAmountToDealer;
    }

    public int getDealerMarkup() {
        return dealerMarkup;
    }

    public void setDealerMarkup(int dealerMarkup) {
        this.dealerMarkup = dealerMarkup;
    }

    public int getPostponementOfTheClient() {
        return postponementOfTheClient;
    }

    public void setPostponementOfTheClient(int postponementOfTheClient) {
        this.postponementOfTheClient = postponementOfTheClient;
    }

    public PartOfImplementation(String id, String region, String managerName,
                                LocalDate dateOfSale, String clientType, String entity,
                                String address, String supplierProductCategory, String supplierSKU,
                                String nameOfProduct, String setSize, float packing, int amount,
                                float weight, float basePrice, float customerSalesAmount,
                                int customerDiscount, float salesAmountToDealer, int dealerMarkup,
                                int postponementOfTheClient) {
        this.id = id;
        this.region = region;
        this.managerName = managerName;
        this.dateOfSale = dateOfSale;
        this.clientType = clientType;
        this.entity = entity;
        this.address = address;
        this.supplierProductCategory = supplierProductCategory;
        this.supplierSKU = supplierSKU;
        this.nameOfProduct = nameOfProduct;
        this.setSize = setSize;
        this.packing = packing;
        this.amount = amount;
        this.weight = weight;
        this.basePrice = basePrice;
        this.customerSalesAmount = customerSalesAmount;
        this.customerDiscount = customerDiscount;
        this.salesAmountToDealer = salesAmountToDealer;
        this.dealerMarkup = dealerMarkup;
        this.postponementOfTheClient = postponementOfTheClient;


    }
}
