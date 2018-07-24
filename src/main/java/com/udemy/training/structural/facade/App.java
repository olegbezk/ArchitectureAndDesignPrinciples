package com.udemy.training.structural.facade;

public class App {

    public static void main(String[] args) {
        final SortingManager sortingManager = new SortingManager();
        sortingManager.doBubbleSort();
        sortingManager.doMergeSort();
        sortingManager.doQuickSort();
    }
}
