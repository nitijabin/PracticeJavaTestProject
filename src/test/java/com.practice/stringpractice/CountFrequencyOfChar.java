package com.practice.stringpractice;

import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyOfChar {

    public static void main(String[] args) {
        String str = "madam";
        printUsingCollections(str);
        printUsingStreamAPI(str);
    }

    public static void printUsingStreamAPI(String str) {
        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    public static void printUsingCollections(String str) {
        char[] inputArr = str.toCharArray();
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : inputArr) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        for (char c : frequencyMap.keySet()) {
            System.out.println(" Word count: " + c + " " + frequencyMap.get(c));
        }
    }
}
