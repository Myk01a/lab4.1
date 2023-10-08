package org.ntuhpi.task4;

import java.util.List;

public class NumberListUtil {
    public static <T extends Number> int indexOfFirstZero(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).doubleValue() == 0.0) {
                return i;
            }
        }
        return -1;
    }

    public static <T extends Number> int countNegativeNumbers(List<T> list) {
        int count = 0;
        for (T num : list) {
            if (num.doubleValue() < 0.0) {
                count++;
            }
        }
        return count;
    }

    public static <T extends Number> T lastNegativeNumber(List<T> list) {
        T lastNegative = null;
        for (T num : list) {
            if (num.doubleValue() < 0.0) {
                lastNegative = num;
            }
        }
        return lastNegative;
    }
}

