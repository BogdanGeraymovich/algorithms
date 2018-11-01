package com.bgeraymovich;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinearSearchTest {

    @Test
    public void search() {
        int[] array = { 1, 4, 5, 3, 8, 3, 5 };
        int searchValue = 5;

        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.search(array, searchValue);
        assertEquals(2, index);
    }

    @Test
    public void searchWrongValue() {
        int[] array = { 1, 4, 5, 3, 8, 3, 5 };
        int searchValue = 7;

        LinearSearch linearSearch = new LinearSearch();
        Integer index = linearSearch.search(array, searchValue);
        assertNull(index);
    }

}