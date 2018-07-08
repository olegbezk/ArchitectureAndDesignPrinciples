package com.udemy.training.behavioral.observer;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObservers();
}
