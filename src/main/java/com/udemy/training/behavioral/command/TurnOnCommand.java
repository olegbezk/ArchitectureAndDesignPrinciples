package com.udemy.training.behavioral.command;

public class TurnOnCommand implements Command {

    private Light light;

    public TurnOnCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }
}
