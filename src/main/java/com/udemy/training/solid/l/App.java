package com.udemy.training.solid.l;

public class App {

    public static void main(String[] args) {
        ElectricVehicle car = new ElectricCar();
        car.speed();
        car.charge();

        NormalVehicle normalVehicle = new Car();
        normalVehicle.addFuel();
        normalVehicle.speed();

    }
}
