package com.udemy.training.behavioral.command;

public class TurnOffCommand implements Command {

    private Light light;

    public TurnOffCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }
}
