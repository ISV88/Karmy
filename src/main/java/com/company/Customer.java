package com.company;

import java.util.HashSet;
import java.util.Objects;

public class Customer {

    public HashSet<ExamplePartOf> partOfImpl = new HashSet<>();


    private String name;

    public Customer(String name) {
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
        if (!(o instanceof Customer customer)) return false;
        return  Objects.equals(getName(), customer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "    Клиент: " + name + "\n" + partOfImpl;
    }
}
