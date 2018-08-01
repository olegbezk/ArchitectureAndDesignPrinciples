package com.udemy.training.service.locator;

public class InitialContext {

    public Object lookup(String jndiName) {
        switch (jndiName) {
            case DatabaseService.NAME:
                return new DatabaseService();
            case MessagingService.NAME:
                return new MessagingService();
            default:
                return null;
        }
    }
}
