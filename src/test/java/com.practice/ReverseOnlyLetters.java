package com.practice;

public class ReverseOnlyLetters {
    public static String reverseLetter(String str) {

        char[] c = str.toCharArray();
        int left = 0;
        int right = c.length - 1;
        while (left < right) {
            if (!Character.isLetter(c[left])) {
                left++;
            } else if (!Character.isLetter(c[right])) {
                right--;
            } else {
                char temp = c[right];
                c[right] = c[left];
                c[left] = temp;
                left++;
                right--;
            }
        }
        String strSwap = new String(c);
        return strSwap;
    }

    public static void main(String[] args) {
        String str = ReverseOnlyLetters.reverseLetter("1a9j0bc2");
        System.out.println(str);
    }
}
