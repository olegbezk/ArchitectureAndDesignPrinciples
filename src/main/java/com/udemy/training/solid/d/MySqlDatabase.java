package com.udemy.training.solid.d;

public class MySqlDatabase implements Database {

    @Override
    public void connect(){
        System.out.println("Connect to MySQL database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect from MySQL database.");
    }
}
