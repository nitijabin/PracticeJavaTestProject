package com.practice.exceptionPractice;

public class ExceptionPractice2 {
    public static void main(String[] args) {
        int a;
        int numbers[] = {1, 2, 3, 5, 6, 3};
        try {
            a = 10/2;
            System.out.println(numbers[10]);
            System.out.println(a);// it will show a run time ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
