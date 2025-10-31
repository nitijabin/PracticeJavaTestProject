package com.practice;

import java.util.ArrayList;
import java.util.List;

public class MergeIntegerStringGenericExmTest {

    public static void main(String[] args) {

        List<Integer> intOne = List.of(2, 3, 1, 4, 7);
        List<Integer> intTWO = List.of(9, 3, 7);
        List<Integer> intThree = List.of(2, 0, 5);

        List<List<Integer>> combineList = new ArrayList<>();
        combineList.add(intOne);
        combineList.add(intTWO);
        combineList.add(intThree);
        System.out.println(combineList);
        System.out.printf("Final Result: "+ mergeList(combineList));

        List<String> stringOne = List.of("abc", "def", "oop");
        List<String> stringTwo = List.of("kol", "drf");
        List<String> stringThree = List.of("mno", "lkof", "drf");
        List<List<String>> combineString = new ArrayList<>();
        combineString.add(stringOne);
        combineString.add(stringTwo);
        combineString.add(stringThree);
        System.out.println(combineString);
        System.out.printf("Final Result: "+ mergeList(combineString));

    }
/*
    public static Set<Integer> mergeList(List<List<Integer>> mergeList) {

        Set<Integer> flattenList = new HashSet<>();
        for(List<Integer> innerList : mergeList){
            for(Integer num: innerList){
                flattenList.add(num);
            }
        }
        return flattenList;
    }

    public static List<String> mergeString(List<List<String>> combineString) {

        List<String> flattenList = new ArrayList<>();
        for(List<String> innerList : combineString){
            for(String num: innerList){
                flattenList.add(num);
            }
        }
        return flattenList;
    }

 */

    public static <T> List<T> mergeList(List<List<T>> mergeList) {

        List<T> flattenList = new ArrayList<>();
        for(List<T> innerList : mergeList){
            for(T num: innerList){
                flattenList.add(num);
            }
        }
        return flattenList;
    }
}
