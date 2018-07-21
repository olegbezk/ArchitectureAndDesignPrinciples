package com.udemy.training.behavioral.visitor;

public interface ShoppingItem {

    double accept(ShoppingCartVisitor visitor);
}
