package com.udemy.training.mvc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Database {

    private List<Person> people;

    public Database() {
        this.people = new ArrayList<>();
    }

    public Person addPerson(Person person) {
        if (people.add(person)) {
            return people.stream()
                    .filter(p -> p.equals(person))
                    .collect(Collectors.collectingAndThen(
                            Collectors.toList(),
                            list -> {
                                if (list.size() != 1) {
                                    throw new IllegalStateException();
                                }
                                return list.get(0);
                            }
                    ));
        }
        return null;
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public List<Person> getPeopleDatabase() {
        return this.people;
    }
}
