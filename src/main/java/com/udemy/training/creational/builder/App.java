package com.udemy.training.creational.builder;

public class App {

    public static void main(String[] args) {

        Person person = new Person.PersonBuilder("Kevin", "kevin@gmail.com")
                .setAddress("address")
                .setAge(22)
                .setUniversity("UCLA")
                .build();

        System.out.println(person);
    }
}
