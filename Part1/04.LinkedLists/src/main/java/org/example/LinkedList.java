package org.example;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void addLast(int item) {
        Node node = new Node(item);

        if (isEmpty()) {
            first = node;
        } else {
            last.next = node;
        }

        last = node;

        size++;
    }

    public void addFirst(int item) {
        Node node = new Node(item);

        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first = node;
        }

        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        int index = 0;
        Node current = first;

        while (current != null) {
            if (current.value == item) {
                return index;
            }

            current = current.next;
            index++;
        }

        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = null;
            last = null;
            size = 0;
            return;
        }

        Node second = first.next;
        first.next = null;
        first = second;

        size--;
    }

    public void deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = null;
            last = null;
            size = 0;
            return;
        }

        last = getPrevious(last);
        last.next = null;

        size--;
    }

    private Node getPrevious(Node node) {
        Node current = first;

        while (current.next != null) {
            if (current.next == node) {
                return current;
            }

            current = current.next;
        }

        return null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];

        Node current = first;
        int i = 0;

        while (current != null) {
            array[i] = current.value;
            current = current.next;
            i++;
        }

        return array;
    }

    public void reverse() {
        if (isEmpty()) return;

        Node previous = first;
        Node current = first.next;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        Node firstPtr = first;
        Node secondPtr = first;

        for (int i = 0; i < k - 1; i++) {
            secondPtr = secondPtr.next;

            if (secondPtr == null) {
                throw new IllegalArgumentException();
            }
        }

        while (secondPtr != last) {
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }

        return firstPtr.value;
    }

    public void printMiddle() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        Node firstPtr = first;
        Node secondPtr = first;

        while (secondPtr != last && secondPtr.next != last) {
            secondPtr = secondPtr.next.next;
            firstPtr = firstPtr.next;

        }

        if (secondPtr == last) {
            System.out.println(firstPtr.value);
        } else {
            System.out.println(firstPtr.value + ", " + firstPtr.next.value);
        }
    }

    public boolean hasLoop() {
        Node slowPtr = first;
        Node fastPtr = first;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                return true;
            }
        }

        return false;
    }

    public static LinkedList createWithLoop() {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        Node node = list.last;

        list.addLast(40);
        list.addLast(50);

        list.last.next = node;

        return list;
    }

}
