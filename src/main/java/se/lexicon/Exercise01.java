package se.lexicon;

import java.util.Arrays;

public class Exercise01 {

    /**
     * 1. Write a program which will store elements in an array of type ‘int’ and
     * print it out.
     * Expected output: 11 23 39 etc.
     */
    public static void ex1() {
        int[] numbers = {23, 11, 5, 50};
                printArray(numbers);
        System.out.println("---------");

    }

    private static void printArray(int[] numbers) {
        int size = numbers.length;
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}