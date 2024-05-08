package org.example;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Reverse a queue
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        reverse(queue);
//        System.out.println(queue);

        // Custom queue (array)
//        ArrayQueue queue = new ArrayQueue(5);
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.enqueue(5);
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.enqueue(6);
//        queue.enqueue(7);
//        queue.enqueue(8);
//        System.out.println(queue.peek());
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.isFull());
//        System.out.println(queue);

        // Custom queue (two stacks)
//        QueueWithTwoStacks queue = new QueueWithTwoStacks();
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.dequeue();
//        queue.dequeue();
//        int first = queue.peek();
//        System.out.println(first);

        // Priority Queue
        PriorityQueue queue = new PriorityQueue(5);
        queue.insert(1);
        queue.insert(3);
        queue.insert(7);
        queue.insert(5);
        queue.insert(2);
        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

    // Reverse a queue
    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.empty()) {
            queue.add(stack.pop());
        }
    }
}