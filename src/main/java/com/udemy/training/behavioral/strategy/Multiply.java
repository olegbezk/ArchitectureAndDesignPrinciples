package com.udemy.training.behavioral.strategy;

public class Multiply implements Strategy {

    @Override
    public void operation(final int num1, final int num2) {
        System.out.println(num1 * num2);
    }
}
