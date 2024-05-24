package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] numbers = { 8, 2, 4, 1, 3 };
        int[] numbers = { 5, 3, 2, 5, 4, 4, 5 };

        // Comparison Sorts

        // Bubble Sort
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(numbers);

        // Selection Sort
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(numbers);

        // Insertion Sort
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(numbers);

        // Merge Sort
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(numbers);

        // Quick Sort
        QuickSort quickSort = new QuickSort();
        quickSort.sort(numbers);

        // Non-comparison Sorts

        // Counting Sort
        CountingSort countingSort = new CountingSort();
        countingSort.sort(numbers);

        // Bucket Sort
        BucketSort bucketSort = new BucketSort();
        bucketSort.sort(numbers, 3);

        System.out.println(Arrays.toString(numbers));
    }
}