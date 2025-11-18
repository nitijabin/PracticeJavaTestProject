package com.practice.stringpractice;

import java.util.HashMap;

public class CountFrequencyOfChar {
    public static void main(String[] args) {
        String str = "madam";
        char [] inputArr = str.toCharArray();
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for(char c : inputArr){
            frequencyMap.put(c, frequencyMap.getOrDefault(c,0)+1);
        }
        for(char c: frequencyMap.keySet()) {
            System.out.println(" Word count: " + c + " " + frequencyMap.get(c));
        }
    }
}
