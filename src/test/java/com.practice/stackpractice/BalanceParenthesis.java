package com.practice.stackpractice;

import java.util.Stack;

public class BalanceParenthesis {
    public static void main(String[] args) {
        String expression = "{(a+b)*[c-d]/e}";
        System.out.println(isBalanced(expression) ? "Balanced" : "Not Balanced");
    }

    private static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
                continue;
            }
            char expected = 0;
            if (ch == ']') expected = '[';
            else if (ch == '}') expected = '{';
            else if (ch == ')') expected = '(';

            if (expected != 0) {
                char topChar = stack.pop();
                if (stack.isEmpty() || topChar != expected) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
