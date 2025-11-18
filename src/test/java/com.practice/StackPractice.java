package com.practice;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("guava");
        stack.push("Orange");
        stack.push("Grape");
        System.out.println(stack.peek() + "  " + stack.search("Banana"));
        stack.pop();
        System.out.println(stack.peek() + " " + stack.search("Banana"));
    }
}
