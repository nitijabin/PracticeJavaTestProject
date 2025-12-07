package com.practice.stringpractice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int left = 0;
        int maxLen = 0;

        Set<Character> window = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            System.out.println("Ch: " + ch);
            // If character already exists, shrink from left
            while (window.contains(ch)) {
                System.out.println("removing: " + s.charAt(left));
                window.remove(s.charAt(left));
                left++;
            }

            // Add the current character
            window.add(ch);

            // Update max length
            maxLen = Math.max(maxLen, right - left + 1);
            System.out.println("Window: "+ window);
        }

        return maxLen;
    }

    public static void main(String[] args) {
       // String s = "abcabacdb";
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        String s = scan2.nextLine();
        // Write your code here.
        Scanner scan3 = new Scanner(System.in);
        double d = scan3.nextDouble();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i );

       // System.out.println("Count: " + LengthOfLastWord.lengthOfLastWord(s));
    }
}
