package com.udemy.training.behavioral.command2;

public class App {

    public static void main(String[] args) {
        final Algorithm algorithm = new Algorithm();

        final Thread thread1 = new Thread(algorithm::produce);
        final Thread thread2 = new Thread(algorithm::consume);

        thread1.start();
        thread2.start();
    }
}
