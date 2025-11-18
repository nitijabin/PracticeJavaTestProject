package com.practice.stringpractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StringLengthCount {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("VVV 9090", "Ja bin", "Ta nzi rul");
        Function<String, Integer> stringToInt = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                int length = s.length();
                return length;
            }
        };

        Stream<Integer> input = names.stream().map(stringToInt);
        input.forEach(lengthCount -> System.out.println(" length : " + lengthCount));

        /*for (String s : names) {
            if (s.matches("[A-Za-z\\s]+")) {
                String s1 = s.replaceAll("\\s+", "");
                System.out.println("name : " + s1 + " length : " + stringToInt.apply(s1));
            }
        }  */
    }
}
