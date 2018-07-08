package com.udemy.training.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private int pressure;

    private int temperature;

    private int humidity;

    private List<Observer> observers;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(final Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(final Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(observer -> observer.update(pressure, temperature, humidity));
    }

    public void setPressure(final int pressure) {
        this.pressure = pressure;
        notifyAllObservers();
    }

    public void setTemperature(final int temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public void setHumidity(final int humidity) {
        this.humidity = humidity;
        notifyAllObservers();
    }
}
