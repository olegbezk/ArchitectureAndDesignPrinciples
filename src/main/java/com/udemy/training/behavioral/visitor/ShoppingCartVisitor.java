package com.udemy.training.behavioral.visitor;

public interface ShoppingCartVisitor {

    double visit(Table table);

    double visit(Chair chair);
}
