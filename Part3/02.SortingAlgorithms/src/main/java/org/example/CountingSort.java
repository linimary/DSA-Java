package org.example;

public class CountingSort {

    public void sort(int[] array) {
        int[] counts = new int[array.length];

        for (int index : array) {
            counts[index]++;
        }

        int j = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                int count = counts[i];
                while (count > 0) {
                    array[j++] = i;
                    count--;
                }
            }
        }
    }

//    public void sort(int[] array, int max) {
//        int[] counts = new int[max + 1];
//        for (int item : array) {
//            counts[item]++;
//        }
//
//        int k = 0;
//        for (int i = 0; i < counts.length; i++) {
//            for (int j = 0; j < counts[i]; j++) {
//                array[k++] = i;
//            }
//        }
//    }
}
