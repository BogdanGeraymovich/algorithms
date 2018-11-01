package com.bgeraymovich;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void sort() {
        InsertionSort insertionSort = new InsertionSort();
        int [] array = {1, 4, 2, 6, 7, 3, 5, 9};
        int [] expectedArray = {1, 2, 3, 4, 5, 6, 7, 9};

        int [] sortedArray = insertionSort.sort(array);

        assertArrayEquals(expectedArray, sortedArray);

    }

}