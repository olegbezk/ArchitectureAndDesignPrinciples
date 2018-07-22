package com.udemy.training.creational.d.t.o;

public class Person {

    private final String name;

    private final int age;

    private String address;

    private String gender;

    public Person(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
