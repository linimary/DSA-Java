package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst(4);
        list.deleteFirst();
        list.deleteLast();
        System.out.println(list.indexOf(4));
        System.out.println(list.contains(1));
        System.out.println(list.size());
        list.reverse();
        System.out.println(list.getKthFromTheEnd(2));
        list.printMiddle();
        System.out.println(Arrays.toString(list.toArray()));

        LinkedList list1 = LinkedList.createWithLoop();
        System.out.println(list1.hasLoop());
    }
}