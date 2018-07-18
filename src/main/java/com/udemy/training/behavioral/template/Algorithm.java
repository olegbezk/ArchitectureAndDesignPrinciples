package com.udemy.training.behavioral.template;

public abstract class Algorithm {

    abstract void initialize();

    abstract void sorting();

    abstract void printResult();

    protected void sort() {
        initialize();
        sorting();
        printResult();
    }
}
