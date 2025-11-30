package com.practice;

import java.util.*;
import java.util.stream.Collectors;

public class Interview {
    public static void main(String[] args) {
        Interview.findAccount();
        Interview.practice();
    }

    public void countString() {
        String str = "automation";
        char[] c = str.toCharArray();
        int count = 0;
        for (char s : c) {
            count++;
        }
        System.out.println(count);
    }

    public static void findAccount() {
        String[] stg = {"Fin-123465", "IT-8762", "fin-988798", "jik-9864", "HR-9876", "908098"};
        Arrays.stream(stg).filter(s -> s.matches("^(Fin|IT|HR)-\\d{4,6}$")).map(s -> s.toUpperCase()).forEach(System.out::println);
    }

    public static void practice() {
        String input = "Hello";
        Map<Character, Long> map = input.chars().mapToObj(ch-> (char)ch)
                .collect(Collectors.groupingBy(ch-> ch, Collectors.counting()));
        map.forEach((k,v)->System.out.println(k+ " "+ v));
    }

}



