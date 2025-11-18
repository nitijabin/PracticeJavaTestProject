package com.practice.numberpractice;

import java.math.BigInteger;

public class BigIntegerFactorialTest {

    public static void main(String[]args){
        int number = 50;
        BigInteger result = factorial(number);
        System.out.println(result);
    }

    public static BigInteger factorial(int number){
        BigInteger result = BigInteger.ONE;
        for(int i = 1; i<=number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
