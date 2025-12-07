package com.practice.stringpractice;

import java.util.Arrays;

public class LongestCommonPrefixStream {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Sort the array using streams
        String[] sorted = Arrays.stream(strs)
                .sorted()
                .toArray(String[]::new);

        String first = sorted[0];
        String last  = sorted[sorted.length - 1];

        int i = 0;
        while (i < first.length() && i < last.length() &&
               first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String[] strs = {"owerfl", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));  // fl
    }
}
