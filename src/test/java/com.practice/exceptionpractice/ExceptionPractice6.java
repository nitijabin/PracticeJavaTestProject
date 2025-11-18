package com.practice.exceptionpractice;

public class ExceptionPractice6 {
    public static void main(String[] args) {
        int a;

        try {
            a = 10 / 0;
            System.out.println(a);// it will show a run time ArithmeticException
        } finally {
            System.out.println("I am in finally block");
        }
    }
}
