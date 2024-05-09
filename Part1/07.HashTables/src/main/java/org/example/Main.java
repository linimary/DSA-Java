package org.example;

public class Main {
    public static void main(String[] args) {

        // Character Finder

        CharacterFinder finder = new CharacterFinder();
        // First non-repeating character
        var ch1 = finder.findFirstNonRepeatingChar("a green apple");
        System.out.println(ch1);
        // First repeated character
        var ch2 = finder.findFirstRepeatedChar("green apple");
        System.out.println(ch2);

        // Custom HashTable

        HashTable table = new HashTable(5);
        table.put(6, "A");
        table.put(8, "B");
        table.put(11, "C");
        table.put(6, "D");
        table.remove(6);

        System.out.println(table.get(6));
    }
}