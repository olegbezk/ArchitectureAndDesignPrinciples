package com.udemy.training.creational.d.t.o;

import java.util.List;

public interface PersonDao {

    Person insertPerson(Person person);

    void removePerson(Person person);

    List<Person> getAllPersons();
}
