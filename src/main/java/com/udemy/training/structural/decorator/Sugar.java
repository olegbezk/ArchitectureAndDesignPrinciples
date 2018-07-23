package com.udemy.training.structural.decorator;

public class Sugar extends BeverageDecorataor {

    private Beverage beverage;

    public Sugar(final Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " sugar";
    }
}
