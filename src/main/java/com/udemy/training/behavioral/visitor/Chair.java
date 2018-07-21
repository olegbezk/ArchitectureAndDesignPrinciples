package com.udemy.training.behavioral.visitor;

public class Chair implements ShoppingItem {

    private String type;

    private double price;

    public Chair(final String type, final double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    @Override
    public double accept(final ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
