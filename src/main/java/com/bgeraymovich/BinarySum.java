package com.bgeraymovich;

public class BinarySum {
    public Integer[] sum(Integer[] a, Integer[] b) {
        int size = a.length;
        Integer[] c = new Integer[size + 1];
        for (int i = size - 1; i >= 0; i--) {
            int j = i + 1;
            if (c[j] == null) {
                c[j] = 0;
            }
            int sum = a[i] + b[i] + c[j];
            if (sum <= 1) {
                c[j] = sum;
                continue;
            }

            c[i] = 1;
        }

        return c;
    }
}
