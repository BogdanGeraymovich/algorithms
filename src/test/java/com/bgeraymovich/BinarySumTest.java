package com.bgeraymovich;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySumTest {

    @Test
    public void sum() {
        BinarySum binarySum = new BinarySum();
        Integer[] a = { 1, 1, 1, 1, 1 };
        Integer[] b = { 1, 1, 0, 0, 0};
        Integer[] c = binarySum.sum(a, b);
        Integer[] expected = { 1, 1, 0, 1, 1, 1 };
        assertArrayEquals(expected, c);
    }
}