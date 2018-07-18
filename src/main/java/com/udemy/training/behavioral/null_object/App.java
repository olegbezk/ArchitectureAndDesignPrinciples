package com.udemy.training.behavioral.null_object;

public class App {

    public static void main(String[] args) {
        CustomerFactory customerFactory = new CustomerFactory();

        System.out.println(customerFactory.getCustomer("Vally").getCustomer());
        System.out.println(customerFactory.getCustomer("Pedro").getCustomer());
    }
}
