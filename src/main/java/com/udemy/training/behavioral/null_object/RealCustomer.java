package com.udemy.training.behavioral.null_object;

public class RealCustomer extends AbstractCustomer {

    RealCustomer(final String customer) {
        this.personName = customer;
    }

    @Override
    protected boolean isNull() {
        return false;
    }

    @Override
    protected String getCustomer() {
        return this.personName;
    }
}
