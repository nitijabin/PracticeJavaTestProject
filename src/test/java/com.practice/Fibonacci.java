package com.practice;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.Arrays;


public class Fibonacci {
    public static void main(String[] args) throws IOException {
        System.out.print("Take input: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(reader.readLine());

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);
        Integer [] numbers = new Integer[n];
        numbers[0] = a;
        numbers[1] = b;

        for (int i = 2; i < n; i++) {
            int next = a + b;
            numbers[i] = next;
            a = b;
            b = next;
        }

        for(Integer number : numbers) {
            System.out.print(" " + number);
        }
    }
}
