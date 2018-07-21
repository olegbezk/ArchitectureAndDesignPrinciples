package com.udemy.training.creational.singleton;

public class BillPughSingleton {

    public static BillPughSingleton instance() {
        return InstanceHolder.singleton;
    }

    private static class InstanceHolder {

        private static BillPughSingleton singleton = new BillPughSingleton();
    }
}
