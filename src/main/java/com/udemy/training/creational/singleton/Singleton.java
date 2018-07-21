package com.udemy.training.creational.singleton;

public enum Singleton {

    INSTANCE;

    private int counter;

    public void setCounter(final int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }
}
