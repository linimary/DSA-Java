package org.example;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
//        System.out.println(tree.find(10));

        // Recursion

        // Tree Traversal
//        tree.traversePreOrder();
//        tree.traverseInOrder();
//        tree.traversePostOrder();
//        System.out.println(tree.height());
//        System.out.println(tree.min());
//        tree.swapRoot();
//        System.out.println(tree.isBinarySearchTree());
//        var list = tree.getNodesAtDistance(1);
//        for (var item : list) {
//            System.out.println(item);
//        }
//        tree.traverseLevelOrder();

//        Tree tree2 = new Tree();
//        tree2.insert(7);
//        tree2.insert(4);
//        tree2.insert(9);
//        tree2.insert(1);
//        tree2.insert(6);
//        tree2.insert(8);
//        tree2.insert(10);
//        System.out.println(tree.equals(tree2));

        // Factorial
//        System.out.println(factorial(4));
    }

    // Factorial - loop
//    public static int factorial(int n) {
//        var factorial = 1;
//
//        for (int i = n; i > 0; i--) {
//            factorial *= i;
//        }
//
//        return factorial;
//    }

    // Factorial - recursion
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * (factorial(n - 1));
    }
}