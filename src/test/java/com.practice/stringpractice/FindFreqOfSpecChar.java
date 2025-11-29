package com.practice.stringpractice;


import java.util.HashMap;
import java.util.Map;

public class FindFreqOfSpecChar {

    public static Map<Character, Integer> getFrequencyMap(String str) {

        char[] charArray = str.toCharArray();
        Map<Character, Integer> freeqMap = new HashMap<>();
        for (char ch : charArray) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                freeqMap.put(ch, freeqMap.getOrDefault(ch, 0) + 1);
            }
        }
        return freeqMap;
    }

    public static void main(String[] args) {
        String str = "abs# @#a";
        Map<Character, Integer> freqMap = FindFreqOfSpecChar.getFrequencyMap(str);
        for (Character c : freqMap.keySet()) {
            System.out.println(c + " : " + freqMap.get(c));
        }
        System.out.println(freqMap);
    }
}
