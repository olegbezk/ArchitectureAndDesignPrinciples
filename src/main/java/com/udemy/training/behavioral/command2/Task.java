package com.udemy.training.behavioral.command2;

public class Task {

    private int id;

    public Task(final int id) {
        this.id = id;
    }

    public void solveProblem() {
        System.out.println("Solve problem with id: " + id);
    }
}
