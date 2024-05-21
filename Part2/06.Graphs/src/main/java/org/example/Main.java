package org.example;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addNode("D");
//        graph.addEdge("A", "B");
//        graph.addEdge("B", "D");
////        graph.removeEdge("A", "C");
////        graph.removeNode("A");
//        graph.addEdge("D", "C");
//        graph.addEdge("A", "C");
//        graph.traverseDepthFirst("A");
//        graph.traverseBreadthFirst("A");
//        graph.print();

        // Topological Sort
//        graph.addNode("X");
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("P");
//        graph.addEdge("X", "A");
//        graph.addEdge("X", "B");
//        graph.addEdge("A", "P");
//        graph.addEdge("B", "P");
//        var list = graph.topologicalSort();
//        System.out.println(list);

        // Cycle Detection
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "A");
        System.out.println(graph.hasCycle());
    }
}