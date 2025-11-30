package com.practice.stringpractice;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFreqOfSpecChar {

    public static void getFrequencyMap(String str) {

        char[] charArray = str.toCharArray();
        Map<Character, Integer> freeqMap = new HashMap<>();
        for (char ch : charArray) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                freeqMap.put(ch, freeqMap.getOrDefault(ch, 0) + 1);
            }
        }
        for (Character c : freeqMap.keySet()) {
            System.out.println(c + " : " + freeqMap.get(c));
        }

    }

    public static void getFrequencyOfCharUsingStreamAPI(String input){
      //  String reg = input.replaceAll("[A-Za-z0-9]","");
        Map<Character, Long> map = input.replaceAll("[A-Za-z0-9\\s]","").chars().mapToObj(ch-> (char)ch)
                .collect(Collectors.groupingBy(ch-> ch, Collectors.counting()));
        map.forEach((k,v)->System.out.println(k+ " "+ v));
    }

    public static void main(String[] args) {
        String str = "abs# @#a";

        FindFreqOfSpecChar.getFrequencyMap(str);
        FindFreqOfSpecChar.getFrequencyOfCharUsingStreamAPI(str);
    }
}
