package com.udemy.training.structural.decorator;

public abstract class BeverageDecorataor implements Beverage {

    protected Beverage beverage;

    public BeverageDecorataor(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription();
    }
}
