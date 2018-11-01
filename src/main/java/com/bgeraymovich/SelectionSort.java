package com.bgeraymovich;

public class SelectionSort {

    public int[] sort(int[] input) {
        for (int min = 0; min < input.length; min++) {
            int lastMin = min;
            for (int j = min + 1; j < input.length; j++) {
                if (input[j] < input[lastMin]) {
                    lastMin = j;
                }
            }
            int tmp = input[min];
            input[min] = input[lastMin];
            input[lastMin] = tmp;
        }

        return input;
    }
}