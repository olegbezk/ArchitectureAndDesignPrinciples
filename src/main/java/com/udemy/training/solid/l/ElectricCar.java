package com.udemy.training.solid.l;

public class ElectricCar implements ElectricVehicle {

    @Override
    public void speed() {
        System.out.println("Speed up with electric car.");
    }

    @Override
    public void charge() {
        System.out.println("Charge car.");
    }

}
