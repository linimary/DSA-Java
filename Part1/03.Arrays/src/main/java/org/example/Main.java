package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(4);
        numbers.insert(5);
//        numbers.insertAt(6,0);
//        numbers.removeAt(2);
//        numbers.reverse();
        numbers.print();
//        System.out.println(numbers.indexOf(2));
//        System.out.println(numbers.max());

        Array numbers1 = new Array(3);
        numbers1.insert(1);
        numbers1.insert(2);
        numbers1.insert(3);
        numbers1.insert(4);

        System.out.println(Arrays.toString(numbers.intersect(numbers1.getElements())));

    }
}