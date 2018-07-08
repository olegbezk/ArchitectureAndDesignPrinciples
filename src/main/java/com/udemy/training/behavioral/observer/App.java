package com.udemy.training.behavioral.observer;

public class App {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherObserver weatherObserver = new WeatherObserver(weatherStation);

        weatherStation.setHumidity(110);
        weatherStation.setPressure(100);
        weatherStation.setTemperature(10);
    }
}
