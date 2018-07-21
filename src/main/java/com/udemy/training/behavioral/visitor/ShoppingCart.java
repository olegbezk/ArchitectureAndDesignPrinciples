package com.udemy.training.behavioral.visitor;

public class ShoppingCart implements ShoppingCartVisitor {

    @Override
    public double visit(final Table table) {
        return table.getPrice();
    }

    @Override
    public double visit(final Chair chair) {
        return chair.getPrice();
    }
}
