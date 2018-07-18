package com.udemy.training.behavioral.iterator;

public class App {

    public static void main(String[] args) {

        String[] names = {"Sara", "John", "Peter", "Anny"};

        NameRepository nameRepository = new NameRepository(names);
        Iterator iterator = nameRepository.getIterator();

        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}
