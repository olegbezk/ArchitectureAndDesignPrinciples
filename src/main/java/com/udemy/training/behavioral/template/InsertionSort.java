package com.udemy.training.behavioral.template;

import java.util.Arrays;

public class InsertionSort extends Algorithm {

    private int[] nums;

    public InsertionSort(final int[] nums) {
        this.nums = nums;
    }

    @Override
    void initialize() {
        System.out.println("\nInitialize insertion sort...");
    }

    @Override
    void sorting() {
        int temp;
        int j;

        for (int i = 0; i < nums.length; i++) {
            temp = this.nums[i];
            j = i;

            while (j > 0 && nums[i - 1] > temp) {
                nums[j] = nums[j - 1];
                j = j - 1;
            }
            nums[j] = temp;
        }
    }

    @Override
    void printResult() {
        Arrays.stream(nums).forEach(value -> System.out.print(value + " "));
    }
}
