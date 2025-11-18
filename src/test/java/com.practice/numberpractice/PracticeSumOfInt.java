package com.practice.numberpractice;

public class PracticeSumOfInt {

    int sum = 0;

    public int sumInt(int input) {

        while (input > 0) {
            sum = sum + (input % 10);
            input = input / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        PracticeSumOfInt practiceSumOfInt = new PracticeSumOfInt();

        System.out.println("Result: " + practiceSumOfInt.sumInt(8790));
    }
}
