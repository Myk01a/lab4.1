package org.ntuhpi.task5;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введіть речення:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        SortedSet<String> words = new TreeSet<>();
        String[] wordArray = sentence.split("\\s+");
        for (String word : wordArray) {
            word = word.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");
            if (!word.isEmpty()) {
                words.add(word.toLowerCase());
            }
        }
        System.out.println("Слова в алфавітному порядку:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

