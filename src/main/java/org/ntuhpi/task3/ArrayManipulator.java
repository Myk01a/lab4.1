package org.ntuhpi.task3;

public class ArrayManipulator {
    public static <T> void swapGroups(T[] arr, int group1Start, int group2Start, int groupSize) {
        for (int i = 0; i < groupSize; i++) {
            T temp = arr[group1Start + i];
            arr[group1Start + i] = arr[group2Start + i];
            arr[group2Start + i] = temp;
        }
    }

    public static <T> void swapAdjacentPairs(T[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            T temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static <T> void replaceGroup(T[] arr, T[] replacement, int startIndex) {
        System.arraycopy(replacement, 0, arr, startIndex, replacement.length);
    }
}

