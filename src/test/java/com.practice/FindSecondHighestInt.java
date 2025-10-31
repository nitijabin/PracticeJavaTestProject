package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighestInt {
    public static void main(String[] args) {
        List<Integer> listArray = Arrays.asList(23,64,23,77,75,97,27);
        Integer myList =
                listArray.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(myList);

        Integer myList2 =
                listArray.stream().distinct().sorted(Comparator.naturalOrder()).skip(1).findFirst().orElse(null);
        System.out.println(myList2);
    }

    public void secondApproachToFIndSecondLargest(){
        int [] numbers = {1,4,3,7,7,8,6};
        int largest = Integer.MIN_VALUE;
        int secondLar = Integer.MIN_VALUE;

        for(int i : numbers){
            if(i > largest){
                secondLar = largest;
                largest = i;
            }
            else if(i > secondLar && i != largest){
                secondLar = i;
            }
        }

        System.out.println(secondLar);
    }
}
