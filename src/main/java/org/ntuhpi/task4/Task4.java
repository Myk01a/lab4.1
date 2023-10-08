package org.ntuhpi.task4;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, -2, 3, 0, -5, 7);
        int index = NumberListUtil.indexOfFirstZero(integerList);
        System.out.println("Індекс першого нульового елемента: " + index);

        int negativeCount = NumberListUtil.countNegativeNumbers(integerList);
        System.out.println("Кількість від'ємних чисел: " + negativeCount);

        Integer lastNegative = NumberListUtil.lastNegativeNumber(integerList);
        System.out.println("Останнє від'ємне число: " + lastNegative);
    }
}
