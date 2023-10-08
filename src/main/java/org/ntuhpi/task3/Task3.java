package org.ntuhpi.task3;

import java.util.Arrays;
import static org.ntuhpi.task3.ArrayManipulator.*;

public class Task3 {
    public static void main(String[] args) {
        // Демонстрація роботи з типом Integer
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        System.out.println("Початковий масив Integer: " + Arrays.toString(intArray));

        swapGroups(intArray, 0, 3, 2);
        System.out.println("Після обміну груп: " + Arrays.toString(intArray));

        swapAdjacentPairs(intArray);
        System.out.println("Після обміну сусідніх пар: " + Arrays.toString(intArray));

        // Демонстрація роботи з типом Double
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("\nПочатковий масив Double: " + Arrays.toString(doubleArray));

        replaceGroup(doubleArray, new Double[]{7.7, 8.8}, 1);
        System.out.println("Після заміни групи: " + Arrays.toString(doubleArray));

        // Демонстрація роботи з типом String
        String[] stringArray = {"apple", "banana", "cherry", "date"};
        System.out.println("\nПочатковий масив String: " + Arrays.toString(stringArray));

        swapAdjacentPairs(stringArray);
        System.out.println("Після обміну сусідніх пар: " + Arrays.toString(stringArray));
    }
}
