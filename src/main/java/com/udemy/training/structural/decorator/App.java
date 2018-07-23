package com.udemy.training.structural.decorator;

public class App {

    public static void main(String[] args) {
        Beverage beverage = new Sugar(new Sugar(new Milk(new PlainBeverage())));

        System.out.println(beverage.getCost());

        System.out.println(beverage.getDescription());
    }
}
