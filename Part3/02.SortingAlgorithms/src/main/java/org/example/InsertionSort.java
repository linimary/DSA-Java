package org.example;

public class InsertionSort {

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int current = array[j];
                if (array[i] > current) {
                    array[j] = array[i];
                    array[i] = current;
                }
            }
        }
    }

//    public void sort(int[] array) {
//        for (int i = 1; i < array.length; i++) {
//            int current = array[i];
//            int j = i - 1;
//            while (j >= 0 && array[j] > current) {
//                array[j + 1] = array[j];
//                j--;
//            }
//            array[j + 1] = current;
//        }
//    }
}
