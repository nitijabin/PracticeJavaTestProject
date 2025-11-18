package com.practice.numberpractice;

public class SumOfDigits {

    public static void main(String[] args) {
        int number = 1234777; // Example number
        int sum = sumOfDigits(number);
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            System.out.println("Current sum: " + sum);
            num /= 10;
            System.out.println("Remaining number: " + num);
        }
        return sum;
    }
}
