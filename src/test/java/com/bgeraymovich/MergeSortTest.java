package com.bgeraymovich;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sort() {
        MergeSort mergeSort = new MergeSort();
        int [] array = {1, 4, 2, 6, 7, 3, 5, 9};
        int [] expectedArray = {1, 2, 3, 4, 5, 6, 7, 9};

        int [] sortedArray = mergeSort.sort(array, 0, array.length - 1);

        assertArrayEquals(expectedArray, sortedArray);

    }

}