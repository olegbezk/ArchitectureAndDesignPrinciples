package com.udemy.training.service.locator;

public class DatabaseService implements Service {

    public static final String NAME ="databaseService";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void execute() {
        System.out.println("Executing database service.");
    }
}
