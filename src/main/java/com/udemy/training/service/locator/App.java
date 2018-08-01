package com.udemy.training.service.locator;

public class App {

    public static void main(String[] args) {
        Service service = ServiceLocator.getService(DatabaseService.NAME);
        service.execute();

        service = ServiceLocator.getService(DatabaseService.NAME);
        service.execute();

        service = ServiceLocator.getService(MessagingService.NAME);
        service.execute();

        service = ServiceLocator.getService(MessagingService.NAME);
        service.execute();
    }
}
