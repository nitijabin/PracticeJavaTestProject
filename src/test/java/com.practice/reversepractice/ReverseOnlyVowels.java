package com.practice.reversepractice;

public class ReverseOnlyVowels {
    public static String reverseLetter(String str) {

        char[] c = str.toCharArray();
        int left = 0;
        int right = c.length - 1;
        String vowels = "AEIOUaeiou";
        while (left < right) {
            if (vowels.indexOf(c[left]) == -1) {
                left++;
            } else if (vowels.indexOf(c[right]) == -1) {
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
        String str = ReverseOnlyVowels.reverseLetter("Hello World");
        System.out.println(str);
    }
}
