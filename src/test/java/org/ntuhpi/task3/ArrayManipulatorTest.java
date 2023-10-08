package org.ntuhpi.task3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayManipulatorTest {

    @Test
    public void testSwapGroups() {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        ArrayManipulator.swapGroups(intArray, 0, 3, 2);
        assertArrayEquals(new Integer[]{4, 5, 3, 1, 2, 6}, intArray);
    }

    @Test
    public void testSwapAdjacentPairs() {
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        ArrayManipulator.swapAdjacentPairs(doubleArray);
        assertArrayEquals(new Double[]{2.2, 1.1, 4.4, 3.3, 5.5}, doubleArray);
    }

    @Test
    public void testReplaceGroup() {
        String[] stringArray = {"apple", "banana", "cherry", "date"};
        ArrayManipulator.replaceGroup(stringArray, new String[]{"grape", "kiwi"}, 1);
        assertArrayEquals(new String[]{"apple", "grape", "kiwi", "date"}, stringArray);
    }
}

