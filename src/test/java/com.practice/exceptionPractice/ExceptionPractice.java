package com.practice.exceptionPractice;

public class ExceptionPractice {
    public static void main(String[] args) {
        try {
            int a = 10/0;
            System.out.println(a);// it will show a run time ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
