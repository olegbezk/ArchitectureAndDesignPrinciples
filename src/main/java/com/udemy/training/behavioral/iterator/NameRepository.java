package com.udemy.training.behavioral.iterator;

class NameRepository {

    private String[] names;

    NameRepository(final String[] names) {
        this.names = names;
    }

    Iterator getIterator() {
        return new NameIterator(names);
    }
}
