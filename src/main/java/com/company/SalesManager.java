package com.company;

import java.util.HashSet;
import java.util.Objects;

public class SalesManager {


    public HashSet<Customer> customers = new HashSet<>();

    private String name;

    public SalesManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalesManager salesManager)) return false;
        return Objects.equals(getName(), salesManager.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Менеджер: " + name + "\n" +
                customers;
    }
}
