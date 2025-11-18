package com.practice;

import java.util.*;
import java.util.stream.Collectors;

public class Interview {
    public static void main(String[] args) {
        // Interview.findAccount();
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
        String[] stg = {"Fin-1234", "IT-8762", "fin-988798", "jik-9864", "HR-9876", "908098"};
        List<String> account =
                Arrays.stream(stg).distinct().filter(s -> s.matches("^(Fin|IT|HR)-\\d{4,6}$")).collect(Collectors.toList());
        System.out.println(account);
    }

    public static void practice() {
        String str = "Hello World";
        String strPP = str.replaceAll("[^A-Za-z]", "");
        System.out.println("Print: " + strPP);
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



