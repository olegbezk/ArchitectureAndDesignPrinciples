package com.udemy.training.behavioral.null_object;

class CustomerFactory {

    private Database database;

    CustomerFactory() {
        this.database = new Database();
    }

    AbstractCustomer getCustomer(String name) {
        if (checkName(name)) {
            return new RealCustomer(name);
        }
        return new NullCustomer();
    }

    private boolean checkName(final String name) {
        return database.existCustomer(name);
    }
}
