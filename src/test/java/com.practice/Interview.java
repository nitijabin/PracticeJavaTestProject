package com.practice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interview {
    public static void main(String[] args) {
        //Interview.findAccount();
        //Interview.practice();
        //Interview.separate();
        //Interview.flatMapTest();
        System.out.println(Interview.validParanthesis() ? "Balance" : "Not Balance");
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
        Map<Character, Long> map = input.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k + " " + v));
    }

    public static void separate() {
        String input = "Hello234";
        Map<String, String> map =
                input.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(s -> Character.isDigit(s) ?
                        "digits" : "letters", Collectors.mapping(String::valueOf, Collectors.joining())));
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    public static void flatMapTest() {
        String input = """
                {
                  "key1": 10,
                  "key2": 20,
                  "key3": 30,
                  "key4": "abc",
                  "address 1": {
                    "house": 41,
                    "city": "whitby"
                  },
                   "address 2": {
                    "house": 43,
                    "city": {
                        "city": "whitby",
                        "house": 47
                            }
                  }
                }
                """;
        ObjectMapper mapper = new ObjectMapper();
        try {
            Map<String, Integer> map = mapper.readValue(input, Map.class);
            extractValue(map).filter(ch -> ch instanceof Number).map(Object::toString).forEach(s -> System.out.println(s));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static Stream<Object> extractValue(Object obj) {
        if (obj instanceof Map<?, ?> map) {
            return map.values().stream().flatMap(Interview::extractValue);
        }
        return Stream.of(obj);
    }

    public static boolean validParanthesis() {
        String s = "()[]{}";
        char[] ch = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (char c : ch) {
            if ((c == '(') || (c == '{') || (c == '[')) {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;

                char topChar = stack.pop();
                if ((c == ')' && topChar != '(') ||
                    (c == '}' && topChar != '{') ||
                    (c == ']' && topChar != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}



