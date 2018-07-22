package com.udemy.training.creational.builder;

public class Person {

    private String name;

    private String email;

    private String address;

    private int age;

    private String university;

    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.address = builder.address;
        this.age = builder.age;
        this.university = builder.university;
    }

    public static class PersonBuilder {

        private final String name;

        private final String email;

        private String address;

        private String university;

        private int age;

        public PersonBuilder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                '}';
    }
}
