package com.udemy.training.behavioral.template;

import java.util.Arrays;

public class BubleSort extends Algorithm {

    private int[] nums;

    public BubleSort(final int[] nums) {
        this.nums = nums;
    }

    @Override
    void initialize() {
        System.out.println("\nInitialize bubble sort...");
    }

    @Override
    void sorting() {
        int n = nums.length;
        int temp;

        while (n != 0) {
            temp = 0;
            for (int i = 1; i < n; i++) {
                if (nums[i - 1] > nums[i]) {
                    int swap = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = swap;
                    temp = i;
                }
            }
            n = temp;
        }
    }

    @Override
    void printResult() {
        Arrays.stream(nums).forEach(value -> System.out.print(value + " "));
    }
}
