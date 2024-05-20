package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Heap heap = new Heap(10);
//        heap.insert(10);
//        heap.insert(5);
//        heap.insert(17);
//        heap.insert(4);
//        heap.insert(22);
//        int removed = heap.remove();
//        System.out.println(removed);

        // Sorting
//        int[] numbers = { 5, 3, 10, 1, 4, 2 };
//        Heap heap = new Heap(10);
//
//        for (int number : numbers) {
//            heap.insert(number);
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = heap.remove();
//        }
//        System.out.println("Sorted(desc): " + Arrays.toString(numbers));
//
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            numbers[i] = heap.remove();
//        }
//        System.out.println("Sorted(asc): " + Arrays.toString(numbers));
//    }

        // Heapify

        int[] numbers = {5, 3, 8, 4, 1, 2};
        MaxHeap.heapify(numbers);
        System.out.println(Arrays.toString(numbers));

        // Kth Largest Item
        System.out.println(MaxHeap.getKthLargest(numbers, 3));
    }
}