package com.udemy.training.behavioral.template;

public class App {

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 5, 7, 6, 2};

        Algorithm bubbleSort = new BubleSort(nums);
        bubbleSort.sort();

        Algorithm insertionSort = new InsertionSort(nums);
        insertionSort.sort();
    }
}
