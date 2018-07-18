package com.udemy.training.behavioral.iterator;

public class NameIterator implements Iterator {

    private String[] names;

    private int index;

    NameIterator(final String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return this.names[index++];
        }
        return null;
    }
}
