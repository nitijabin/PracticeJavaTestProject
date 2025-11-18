package com.practice.numberpractice;

import java.util.*;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPrime(number)) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is NOT a Prime number.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; // divisible by a number other than 1 and itself
        }

        return true;
    }
}
