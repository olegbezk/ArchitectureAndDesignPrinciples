package com.udemy.training.creational.d.t.o;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Database implements PersonDao {

    private List<Person> people;

    public Database() {
        this.people = new ArrayList<>();
    }

    @Override
    public Person insertPerson(final Person person) {
        if (people.add(person)) {
            return people.stream()
                    .filter(p -> p.equals(person))
                    .collect(toSingleton());
        }
        return null;
    }

    @Override
    public void removePerson(final Person person) {
        people.remove(person);
    }

    @Override
    public List<Person> getAllPersons() {
        return this.people;
    }

    private static <T> Collector<T, ?, T> toSingleton() {
        return Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                    if (list.size() != 1) {
                        throw new IllegalStateException();
                    }
                    return list.get(0);
                }
        );
    }
}
