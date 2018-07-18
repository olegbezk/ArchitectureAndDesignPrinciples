package com.udemy.training.behavioral.null_object;

public class NullCustomer extends AbstractCustomer {

    @Override
    protected boolean isNull() {
        return true;
    }

    @Override
    protected String getCustomer() {
        return "";
    }
}
