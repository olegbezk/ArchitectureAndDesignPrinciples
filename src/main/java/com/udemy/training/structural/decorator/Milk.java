package com.udemy.training.structural.decorator;

public class Milk extends BeverageDecorataor {

    private Beverage beverage;

    public Milk(final Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " milk";
    }
}
