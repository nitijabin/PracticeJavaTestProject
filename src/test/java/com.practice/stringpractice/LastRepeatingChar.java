package com.practice.stringpractice;

import java.util.HashSet;
import java.util.Set;

public class LastRepeatingChar {

    public static void main(String[] args) {
        String str = "proograming";
        char [] inputArray = str.toCharArray();
        Set<Character> seen = new HashSet<>();
        char lastRepeating = ' ';

        for (char c : inputArray) {
            if (seen.contains(c)) {
                lastRepeating = c;
            }else seen.add(c);
        }
        System.out.println("Last repeating: " + lastRepeating); // g

    }
}
