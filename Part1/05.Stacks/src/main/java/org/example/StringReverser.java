package org.example;

import java.util.Stack;

public class StringReverser {

    public String reverse(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.empty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
