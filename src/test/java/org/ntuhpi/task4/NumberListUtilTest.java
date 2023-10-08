package org.ntuhpi.task4;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class NumberListUtilTest {

    @Test
    public void testIndexOfFirstZero() {
        List<Integer> integerList = Arrays.asList(1, -2, 0, 3, -5, 7);
        int index = NumberListUtil.indexOfFirstZero(integerList);
        assertEquals(2, index);

        List<Double> doubleList = Arrays.asList(1.0, 2.5, -0.5, 0.0, -3.0);
        int doubleIndex = NumberListUtil.indexOfFirstZero(doubleList);
        assertEquals(3, doubleIndex);

        List<Long> longList = Arrays.asList(10L, 20L, 30L, 40L);
        int longIndex = NumberListUtil.indexOfFirstZero(longList);
        assertEquals(-1, longIndex);
    }

    @Test
    public void testCountNegativeNumbers() {
        List<Integer> integerList = Arrays.asList(1, -2, 3, -5, 7);
        int count = NumberListUtil.countNegativeNumbers(integerList);
        assertEquals(2, count);

        List<Double> doubleList = Arrays.asList(1.0, 2.5, -0.5, -3.0, 4.0);
        int doubleCount = NumberListUtil.countNegativeNumbers(doubleList);
        assertEquals(2, doubleCount);

        List<Long> longList = Arrays.asList(10L, 20L, 30L, 40L);
        int longCount = NumberListUtil.countNegativeNumbers(longList);
        assertEquals(0, longCount);
    }

    @Test
    public void testLastNegativeNumber() {
        List<Integer> integerList = Arrays.asList(1, -2, 3, -5, 7);
        Integer lastNegative = NumberListUtil.lastNegativeNumber(integerList);
        assertEquals(Integer.valueOf(-5), lastNegative);

        List<Double> doubleList = Arrays.asList(1.0, 2.5, -0.5, -3.0, 4.0);
        Double doubleLastNegative = NumberListUtil.lastNegativeNumber(doubleList);
        assertEquals(Double.valueOf(-3.0), doubleLastNegative);

        List<Long> longList = Arrays.asList(10L, 20L, 30L, 40L);
        Long longLastNegative = NumberListUtil.lastNegativeNumber(longList);
        assertNull(longLastNegative);
    }
}

