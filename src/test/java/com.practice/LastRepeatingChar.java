package com.practice;

import java.util.HashSet;
import java.util.Set;

public class LastRepeatingChar {

    public  static void main(String[] args) {
        String str = "proograming";
        Set<Character> seen = new HashSet<>();
        System.out.println(seen + " this is seen" + (str.length()-1));
        Character lastRepeating = null;

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (seen.contains(c)) {
                lastRepeating = c;
                break;
            }
            seen.add(c);
            System.out.println(seen + " this is seen inside loop");
        }
        System.out.println("Last repeating: " + lastRepeating); // g

    }
}
