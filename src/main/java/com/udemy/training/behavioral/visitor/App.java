package com.udemy.training.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<ShoppingItem> items = new ArrayList<>();
        items.add(new Table("Desk", 20));
        items.add(new Chair("Chair", 20));
        items.add(new Chair("Chair2", 22));

        double sum;
        ShoppingCartVisitor cartVisitor = new ShoppingCart();

        sum = items.stream().mapToDouble(item -> item.accept(cartVisitor)).sum();

        System.out.println(sum);
    }
}
