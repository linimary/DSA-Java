package org.example;

import java.util.Arrays;

public class Stack {

    private int size;
    private int[] stack;

    public Stack() {
        this.size = 0;
        this.stack = new int[size];
    }

    public void push(int item) {
        size++;
        stack = Arrays.copyOf(stack, size);
        stack[size - 1] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        int last = stack[size - 1];
        stack = Arrays.copyOf(stack, --size);

        return last;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        return stack[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int min() {
        int min = stack[0];

        for (int i = 1; i < stack.length; i++) {
            if (stack[i] < min) {
                min = stack[i];
            }
        }

        return min;
    }

    public void print() {
        System.out.println(Arrays.toString(stack));
    }
}
