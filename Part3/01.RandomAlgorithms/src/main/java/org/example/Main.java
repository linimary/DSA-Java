package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();
        List<Integer> numbers = List.of(1, 2, 4, 4, 3, 3, 3, 5, 4, 1, 1);

        // Find the smallest most common integer
        System.out.println(counter.mostCommon(numbers));

        // Returns first duplicate
        System.out.println(counter.firstDuplicate(numbers));
    }
}