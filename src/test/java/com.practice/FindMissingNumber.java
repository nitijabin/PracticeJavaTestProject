package com.practice;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6};
        int totalNumbers = 6;
        int totalNumberSum = totalNumbers * (totalNumbers + 1) / 2;
        int sumOfArray = Arrays.stream(numbers).sum();
        System.out.println("Missing Number: " + (totalNumberSum - sumOfArray));
    }
}
