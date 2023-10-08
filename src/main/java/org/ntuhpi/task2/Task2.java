package org.ntuhpi.task2;

import static org.ntuhpi.task2.Month.*;

public class Task2 {
    public static void main(String[] args) {
        Month january = ЧЕРВЕНЬ;
        System.out.println("Попередній місяць від " + january.getNameUkr() + ": " + january.getPreviousMonth().getNameUkr());
        System.out.println("Наступний місяць від " + january.getNameUkr() + ": " + january.getNextMonth().getNameUkr());
        System.out.println(january.getNameUkr() + " належить до сезону: " + january.getSeason());

        System.out.println("\nУсі місяці:");
        Month.printAllMonths();
    }
}
