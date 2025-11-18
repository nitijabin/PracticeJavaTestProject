package com.practice.stringpractice;

public class StringManipulation {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String input = "12abc24xyz36skdlf10";
        char[] strArr = input.toCharArray();
        int sum = 0;

        for (char c : strArr) {
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    sum = sum + Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        if (sb.length() > 0) {
            sum = sum + Integer.parseInt(sb.toString());
        }
        System.out.println(sum);
    }
}
