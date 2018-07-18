package com.udemy.training.behavioral.null_object;

import java.util.ArrayList;
import java.util.List;

class Database {

    private List<String> customerNames;

    Database() {
        this.customerNames = new ArrayList<>();
        this.customerNames.add("Pedro");
        this.customerNames.add("Adam");
        this.customerNames.add("Joe");
        this.customerNames.add("Michael");
    }

    boolean existCustomer(String name) {
        return customerNames.contains(name);
    }
}
