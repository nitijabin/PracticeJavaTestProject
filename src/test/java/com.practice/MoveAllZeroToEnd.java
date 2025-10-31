package com.practice;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[] numbers = {2, 0, 3, 0, 1, 0, 4};
        int nonZero = 0;
        int temp;
        for (int current = 0; current < numbers.length; current++) {
            if (numbers[current] != 0) {
                temp = numbers[nonZero];
                numbers[nonZero] = numbers[current];
                numbers[current] = temp;
                nonZero++;
            }
        }
        for (int no : numbers) {
            System.out.print(no + " ");
        }

    }
}
