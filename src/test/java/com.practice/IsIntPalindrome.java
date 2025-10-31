package com.practice;

import java.util.Arrays;

public class IsIntPalindrome {
    public static boolean isIntPalindrome(int x) {

        int reverse = 0;
        int number = x;
        if (x < 0) {
            return false;
        }
        if (x == reverse)
            return true;
        else
            return false;
    }

    public static boolean isStringPalindrome(String str) {
        String strWithoutDelimiter = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuilder reverse = new StringBuilder();
        for (int i = (strWithoutDelimiter.length() - 1); i >= 0; i--) {
            reverse.append(strWithoutDelimiter.charAt(i));
        }

        if(strWithoutDelimiter.equals(reverse.toString())) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println(isIntPalindrome(-121));
        System.out.println(isStringPalindrome("0P"));
    }
}
