package com.udemy.training.creational.d.t.o;

public class App {

    public static void main(String[] args) {
        Database database = new Database();

        final Person john = new Person("John", 30);

        database.insertPerson(john);
        database.insertPerson(new Person("ken", 33));
        database.insertPerson(new Person("Mylo", 21));

        database.getAllPersons().forEach(System.out::println);

        database.removePerson(john);
        System.out.println();

        database.getAllPersons().forEach(System.out::println);
    }
}
