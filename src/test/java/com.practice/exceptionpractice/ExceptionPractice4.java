package com.practice.exceptionpractice;

public class ExceptionPractice4 {
    public static void main(String[] args) {
        int a;
        int numbers[] = {1, 2, 3, 5, 6, 3};
        try {
            a = 10/0;
            System.out.println(numbers[10]);
            System.out.println(a);// it will show a run time ArithmeticException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e ) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("In catch block");
        } finally {
            //close all the open resources!!
            System.out.println("Executing the finally block.");
        }
    }
}
