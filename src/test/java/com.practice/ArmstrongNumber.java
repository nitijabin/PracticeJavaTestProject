package com.practice;

public class ArmstrongNumber {

    /**
     * Main method to test the isArmstrong function.
     * It checks if the number 153 is an Armstrong number.
     */

    public static void main(String[] args) {
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    /**
     * Checks if a number is an Armstrong number.
     * An Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits.
     *
     * @param num the number to check
     * @return true if num is an Armstrong number, false otherwise
     */
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }

}
