package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 5, 4, 8, 2, 1, 0 };
        Arrays.sort(numbers);
        Search search = new Search();

        // Linear Search
//        int index = search.linearSearch(numbers, 8);

        // Binary Search - Recursive/Iterative
//        int index = search.binarySearch(numbers, 8);

        // Ternary Search
//        int index = search.ternarySearch(numbers, 4);

        // Jump Search
//        int index = search.jumpSearch(numbers, 4);

        // Exponential Search
        int index = search.exponentialSearch(numbers, 4);

        System.out.println(index);
    }
}