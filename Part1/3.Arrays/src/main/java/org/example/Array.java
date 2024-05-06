package org.example;

import java.util.Arrays;

public class Array {

    private int size;
    private int[] elements;
    private int elementCounter;

    public Array(int size) {
        this.size = size;
        this.elements = new int[size];
        this.elementCounter = 0;
    }

    public int[] getElements() {
        return elements;
    }

    public void insert(int element) {
        if (elementCounter == size - 1) {
            size += 1;
            elements = Arrays.copyOf(elements, size - 1);
        }

        elements[elementCounter] = element;
        elementCounter++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= elementCounter) {
            throw new IllegalArgumentException("Out of range");
        }

        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elementCounter--;
    }

    public int indexOf(int element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                return i;
            }
        }

        return -1;
    }

    public void print() {
//        for (int i = 0; i < elementCounter; i++) {
//            System.out.println(elements[i]);
//        }
        System.out.println(Arrays.toString(elements));
    }

    public int max() {
        int maxEl = elements[0];

        for (int i = 1; i < elementCounter; i++) {
            if (elements[i] > maxEl) {
                maxEl = elements[i];
            }
        }

        return maxEl;
    }

    public int[] intersect(int[] another) {
        int commonCounter = 0;

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < another.length; j++) {
                if (elements[i] == another[j]) {
                    commonCounter++;
                }
            }
        }

        int[] common = new int[commonCounter];

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < another.length; j++) {
                if (elements[i] == another[j]) {
                    common[j] = another[j];
                }
            }
        }

        return common;
    }

    public void reverse() {
        for (int i = 0; i < elements.length / 2; i++) {
            int temp = elements[i];
            elements[i] = elements[elements.length - 1 - i];
            elements[elements.length - 1 - i] = temp;
        }
    }

    public void insertAt(int item, int index) {
        elements = Arrays.copyOf(elements, size);

        for (int i = elements.length - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        elements[index] = item;
    }
}
