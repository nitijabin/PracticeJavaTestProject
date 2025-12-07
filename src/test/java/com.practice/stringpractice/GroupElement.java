package com.practice.stringpractice;

import com.practice.Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupElement {
    public static void groupElement() {
        List<String> list = List.of("apple", "bat", "banana", "cat", "dog", "orange");
        Map<Integer, List<String>> newList = new HashMap<>();
        for (int i = 0; i< list.size(); i++) {
            int key = list.get(i).length();
            newList.computeIfAbsent(key,
                    k-> new ArrayList<>()).add(list.get(i));
        }
        System.out.println(newList);

        Map<Integer, List<String>> map =
                list.stream()
                        .collect(Collectors.groupingBy(String::length));
        // Print the groups
        map.forEach((k,v)->System.out.println(k + " " + v));
    }

    public static void main(String[] args) {
        GroupElement.groupElement();
    }

}
