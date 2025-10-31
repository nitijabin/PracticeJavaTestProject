package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StreamTest {

    public  static void main(String[] args) {

       Integer[] numbers = {12,21,39,49,55,63,72,84,19,11};
        //Stream<Integer> numberOfStream = Arrays.stream(numbers);
        //Stream<Integer> filterNumbers = numberOfStream.filter(num -> num%2 == 0);
        //filterNumbers.forEach(num -> System.out.println("This is number: " + num));

        Arrays.stream(numbers).filter(num -> num >50).forEach(numb -> System.out.println("This is number greater " + "than" + " 50: " + numb));
    }
}
