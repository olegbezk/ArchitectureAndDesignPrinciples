package com.udemy.training.behavioral.strategy;

public class App {

    public static void main(String[] args) {
        StrategyManager strategyManager = new StrategyManager();
        strategyManager.setStrategy(new Add());

        strategyManager.operation(2, 3);

        strategyManager.setStrategy(new Multiply());

        strategyManager.operation(2, 3);
    }
}
