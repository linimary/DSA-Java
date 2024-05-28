package org.example;

public class Main {
    public static void main(String[] args) {
        String str = "  trees   are beautiful ";

        // Count Vowels
        int count = StringUtils.countVowels(str);
        System.out.println(count);

        // Reverse a string
        String reversed = StringUtils.reverse(str);
        System.out.println(reversed);

        // Reverse words
        String reversedWords = StringUtils.reverseWords(str);
        System.out.println(reversedWords);

        // Rotations
        boolean areRotations = StringUtils.areRotations("ABCD", "DABC");
        System.out.println(areRotations);

        // Remove Duplicates
        String output = StringUtils.removeDuplicates(str);
        System.out.println(output);

        // Most repeated character
        char most = StringUtils.getMostRepeatedChar(str);
        System.out.println(most);
        char max = StringUtils.getMaxOccuringChar(str);
        System.out.println(max);

        // Capitalize
        String capitalized = StringUtils.capitalize(str);
        System.out.println(capitalized);

        // Anagrams - Using Sorting
        boolean areAnagrams = StringUtils.areAnagrams("ABCD", "CBDA");
        System.out.println(areAnagrams);

        // Anagrams - Using Histogramming
        boolean areAnagram = StringUtils.areAnagram("ABCD", "CBDA");
        System.out.println(areAnagram);

        // Palindrome
        boolean result = StringUtils.isPalindrome("ABBA");
        System.out.println(result);
    }
}