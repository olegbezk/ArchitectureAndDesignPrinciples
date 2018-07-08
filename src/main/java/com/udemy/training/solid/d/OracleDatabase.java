package com.udemy.training.solid.d;

public class OracleDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connect to Oracle database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect to Oracle database.");
    }
}
