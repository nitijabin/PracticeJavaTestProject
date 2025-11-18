package com.practice.stringpractice;

import com.practice.Interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        Interview.practice();
    }

    public static void practice() {
        String str = "Hello World";
        String strPP = str.replaceAll("[^A-Za-z]", "");
        char[] strArr = strPP.toCharArray();

        Set<Character> strOne = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : strArr) {
            strOne.add(c);
        }
        for (char c : strOne) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
