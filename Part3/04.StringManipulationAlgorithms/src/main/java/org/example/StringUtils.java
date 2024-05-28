package org.example;

import com.sun.source.tree.BreakTree;

import java.io.FileReader;
import java.util.*;

public class StringUtils {

    public static int countVowels(String str) {
        int count = 0;

        for (char ch : str.toLowerCase().toCharArray()) {
            if (isVowel(ch)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' ||
               ch == 'e' ||
               ch == 'o' ||
               ch == 'u' ||
               ch == 'i';
    }

//    public static int countVowels(String str) {
//        if (str == null) {
//            return 0;
//        }
//
//        int count = 0;
//        // if too big, better use Set
//        String vowels = "aeiou";
//
//        for (var ch : str.toLowerCase().toCharArray()) {
//            // vowels.indexOf(ch) != -1
//            if (vowels.contains(Character.toString(ch))) {
//                count++;
//            }
//        }
//
//        return count;
//    }

    public static String reverse(String str) {
        if (str == null) {
            return "";
        }

        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed.append(str.toCharArray()[i]);
             reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

//    public static String reverseWords(String sentence) {
//        if (sentence == null) {
//            return "";
//        }
//
//        String[] words = sentence.split(" ");
//        StringBuilder reversed = new StringBuilder();
//
//        for (int i = words.length - 1; i >= 0; i--) {
//            reversed.append(words[i]).append(" ");
//        }
//
//        return reversed.toString().trim();
//    }

    public static String reverseWords(String sentence) {
        if (sentence == null) {
            return "";
        }

        String[] words = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));

        return String.join(" ", words);
    }

    public static boolean areRotations(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        return (str1.length() == str2.length() &&
                (str1 + str1).contains(str2));
    }

    public static String removeDuplicates(String str) {
        if (str == null) {
            return "";
        }

        Set<Character> unique = new HashSet<>();
        StringBuilder output = new StringBuilder();

        for (var ch : str.toCharArray()) {
            if (!unique.contains(ch)) {
                unique.add(ch);
                output.append(ch);
            }
        }

        return output.toString();
    }

    public static char getMostRepeatedChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }

        HashMap<Character, Integer> entries = new HashMap<>();

        for (var ch : str.toCharArray()) {
            if (entries.containsKey(ch)) {
                // entries.replace(ch, entries.get(ch) + 1);
                var count = entries.get(ch);
                entries.put(ch, count + 1);
            }

            entries.putIfAbsent(ch, 1);
        }

        int max = Collections.max(entries.values());
        char result = ' ';
        for (var entry : entries.entrySet()) {
            if (entry.getValue() == max) {
                result = entry.getKey();
            }
        }

        return result;
    }

    public static char getMaxOccuringChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }

        final int ASCII_SIZE = 256;
        int[] frequencies = new int[ASCII_SIZE];
        for (var ch : str.toCharArray()) {
            frequencies[ch]++;
        }

        int max = 0;
        char result = ' ';
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > max) {
                max = frequencies[i];
                result = (char) i;
            }
        }

        return result;
    }

    public static String capitalize(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        String[] words = sentence
                            .trim()
                            .replaceAll(" +", " ")
                            .split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() +
                       words[i].substring(1).toLowerCase();
        }

        return String.join(" ", words);
    }

    // O (n log n)
    public static boolean areAnagrams(String first, String second) {
        if (first == null || second == null ||
            first.length() != second.length()) {
            return false;
        }

        // O(n)
        var array1 = first.toLowerCase().toCharArray();
        // O (n log n)
        Arrays.sort(array1);

        var array2 = second.toLowerCase().toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    // O(n)
    public static boolean areAnagram(String first, String second) {
        if (first == null || second == null) {
            return false;
        }

        final int ENGLISH_ALPHABET = 26;
        int[] frequencies = new int[ENGLISH_ALPHABET];

        first = first.toLowerCase();
        // O(n)
        for (int i = 0; i < first.length(); i++) {
            frequencies[first.charAt(i) - 'a']++;
        }

        second = second.toLowerCase();
        // O(n)
        for (int i = 0; i < second.length(); i++) {
            var index = second.charAt(i) - 'a';
            if (frequencies[index] == 0) {
                return false;
            }

            frequencies[index]--;
        }

        return true;
    }

//    public static boolean isPalindrome(String word) {
//        if (word == null) {
//            return false;
//        }
//
//        var input = new StringBuilder(word);
//        input.reverse();
//
//        return input.toString().equals(word);
//    }

    public static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left++) != word.charAt(right--)) {
                return false;
            }
        }

        return true;
    }
}
