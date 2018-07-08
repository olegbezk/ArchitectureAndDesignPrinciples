package com.udemy.training.behavioral.observer;

public class WeatherObserver implements Observer {

    private int pressure;

    private int temperature;

    private int humidity;

    private Subject subject;

    public WeatherObserver(final Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(final int pressure, final int temperature, final int humidity) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;

        showData();
    }

    private void showData() {
        System.out.println("Pressure: " + this.pressure + ", temperature: " + this.temperature +
                ", humidity: " + this.humidity);
    }
}
