package com.udemy.training.solid.o;

public class App {

    public static void main(String[] args) {
        SorterManager sorterManager = new SorterManager();

        sorterManager.sorter(new MergeSort());
        sorterManager.sorter(new InsertionSort());
        sorterManager.sorter(new QuickSort());
    }
}
