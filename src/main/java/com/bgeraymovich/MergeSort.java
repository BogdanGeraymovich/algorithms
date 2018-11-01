package com.bgeraymovich;

public class MergeSort {

    public int[] sort(int[] array, int p, int r) {
        if (p < r) {
            int q = Math.round((p + r) / 2);
            sort(array, p, q);
            sort(array, q + 1, r);
            merge(array, p, q, r);
        }

        return array;
    }

    public int[] merge(int[] array, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];

        for (int i = 0; i < n1; i++) {
            left[i] = array[p + i - 1];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = array[q + i];
        }

        left[n1 - 1] = -1;
        right[n2 - 1] = -1;
        int i = 0;
        int j = 0;
        for (int k = p; k < r; k++) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
        }

        return array;
    }
}