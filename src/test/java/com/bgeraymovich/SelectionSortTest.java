package com.bgeraymovich;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void sort() {
        SelectionSort selectionSort = new SelectionSort();
        int [] array = {1, 4, 2, 6, 7, 3, 5, 9};
        int [] expectedArray = {1, 2, 3, 4, 5, 6, 7, 9};

        int [] sortedArray = selectionSort.sort(array);

        assertArrayEquals(expectedArray, sortedArray);

    }

}