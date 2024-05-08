package org.example;

public class Main {
    public static void main(String[] args) {

//        String str = "reviver";

        // Reverse a string 1

//        StringReverser reverser = new StringReverser();
//        String result = reverser.reverse(str);
//
//        System.out.println(result);

        // Reverse a string 2

//        StringBuilder reversed = new StringBuilder();
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed.append(str.charAt(i));
//        }
//
//        System.out.println(reversed);

        // Palindrome

//        boolean isPalindrome = false;
//
//        for (int i = 0; i < str.length(); i++) {
//            isPalindrome = (str.charAt(i) == str.charAt(str.length() - 1 - i));
//        }
//
//        System.out.println(isPalindrome);

        // Balanced Expressions
//
//        Expression expression = new Expression();
//        System.out.println(expression.isBalanced("(<1> + 2)"));

        // Custom Stack (array)

        Stack stack = new Stack();
        stack.push(5);
        stack.push(2);
        stack.push(10);
        stack.push(1);

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.min());
        stack.pop();
        System.out.println(stack.min());

        stack.print();
    }
}