package com.udemy.training.structural.adapter;

public class BicycleAdapter implements Vehicle {

    private Bicycle bicycle;

    public BicycleAdapter(final Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        this.bicycle.go();
    }
}
