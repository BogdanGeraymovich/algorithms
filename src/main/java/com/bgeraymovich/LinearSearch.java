package com.bgeraymovich;

public class LinearSearch {
    public Integer search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return  i;
            }
        }

        return null;
    }
}
