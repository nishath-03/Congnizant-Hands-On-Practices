package com.deepskilling.junit.basic.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class ListOperationsTest {

    private List<String> fruitsList;

    @Before
    public void setUp() {
        // Initialize the list
        fruitsList = new ArrayList<>();
        // Add default items
        fruitsList.add("Apple");
        fruitsList.add("Banana");
    }

    @After
    public void tearDown() {
        // Clear references
        fruitsList.clear();
        fruitsList = null;
    }

    // first test case
    @Test
    public void testAddItemToList() {
        // 1. Arrange (Set up inputs and pre-conditions)
        String newItem = "Orange";
        int expectedSizeBefore = 2; 
        int expectedSizeAfter = 3;

        assertEquals(expectedSizeBefore, fruitsList.size());

        // 2. Act (Execute the method under test)
        fruitsList.add(newItem);

        // 3. Assert (Verify the output)
        assertEquals(expectedSizeAfter, fruitsList.size());
        assertTrue(fruitsList.contains("Orange"));
    }

    //second test case
    @Test
    public void testRemoveItemFromList() {
        // 1. Arrange (Set up inputs and pre-conditions)
        String itemToRemove = "Apple";
        int expectedSizeBefore = 2;
        int expectedSizeAfter = 1;

        assertTrue(fruitsList.contains(itemToRemove));

        // 2. Act (Execute the method under test)
        boolean isRemoved = fruitsList.remove(itemToRemove);

        // 3. Assert (Verify the output)
        assertTrue(isRemoved);
        assertEquals(expectedSizeAfter, fruitsList.size());
        assertFalse(fruitsList.contains("Apple"));
    }
}
