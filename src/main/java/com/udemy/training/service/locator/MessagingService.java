package com.udemy.training.service.locator;

public class MessagingService implements Service {

    public static final String NAME= "messagingService";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void execute() {
        System.out.println("Executing messaging service.");
    }
}
