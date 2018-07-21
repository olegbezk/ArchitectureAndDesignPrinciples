package com.udemy.training.creational.singleton;

public class App {

    public static void main(String[] args) {
        final Downloader instance = Downloader.getInstance();
        instance.startDownloading();

        final Downloader instance1 = Downloader.getInstance();
        instance1.startDownloading();

        if (instance == instance1) {
            System.out.println("They are the same");
        }

        final BillPughSingleton instance2 = BillPughSingleton.instance();
        final BillPughSingleton instance3 = BillPughSingleton.instance();

        if (instance2 == instance3) {
            System.out.println("They are the same");
        }

        Singleton.INSTANCE.setCounter(10);
        System.out.println(Singleton.INSTANCE.getCounter());
    }
}
