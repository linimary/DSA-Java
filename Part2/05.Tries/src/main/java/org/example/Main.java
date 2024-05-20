package org.example;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("car");
        trie.insert("card");
        trie.insert("care");
        trie.insert("careful");
        trie.insert("egg");
        var words = trie.findWords("car");
        System.out.println(words);
//        trie.remove("car");
//        trie.traverse();
//        System.out.println(trie.contains("car"));
//        System.out.println(trie.contains("care"));
    }
}