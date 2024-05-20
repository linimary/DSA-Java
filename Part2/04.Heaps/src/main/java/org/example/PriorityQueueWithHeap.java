package org.example;

public class PriorityQueueWithHeap {
    private Heap heap;

    public PriorityQueueWithHeap(int capacity) {
        this.heap = new Heap(capacity);
    }

    public void enqueue(int item) {
        heap.insert(item);
    }

    public int dequeue() {
        return heap.remove();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
