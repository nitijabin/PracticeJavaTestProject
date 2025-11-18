package com.practice.reversepractice;

public class ReverseInteger {
    public static int reverse(int x) {

        int output = 0;
        int number = x;
        while (number != 0) {
            if (output > Integer.MAX_VALUE / 10 || (output == Integer.MAX_VALUE / 10 && (number % 10) > 7)) {
                return 0;
            }
            if (output < Integer.MIN_VALUE / 10 || (output == Integer.MIN_VALUE / 10 && (number % 10) < -8)) {
                return 0;
            }

            output = output * 10 + (number % 10);
            number = number / 10;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println("Reverse: " +  reverse(1534236469));
    }
}

