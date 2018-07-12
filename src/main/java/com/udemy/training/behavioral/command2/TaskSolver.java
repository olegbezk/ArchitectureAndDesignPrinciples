package com.udemy.training.behavioral.command2;

public class TaskSolver implements Command {

    private Task task;

    public TaskSolver(final Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        this.task.solveProblem();
    }
}
