package com.udemy.training.behavioral.strategy;

public class StrategyManager implements Strategy {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void operation(final int num1, final int num2) {
        this.strategy.operation(num1, num2);
    }
}
