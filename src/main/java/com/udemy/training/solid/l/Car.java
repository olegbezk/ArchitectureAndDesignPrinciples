package com.udemy.training.solid.l;

public class Car implements NormalVehicle {

    @Override
    public void speed() {
        System.out.println("Speed up the car.");
    }

    @Override
    public void addFuel() {
        System.out.println("Add some fuel.");
    }
}
