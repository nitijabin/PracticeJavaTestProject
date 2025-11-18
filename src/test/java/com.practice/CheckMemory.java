package com.practice;

import com.practice.numberpractice.Fibonacci;
import org.testng.annotations.Test;

@Test
public class CheckMemory {
    public void check() {
        Fibonacci fibonacci = new Fibonacci();
        Fibonacci fibonacci1 = new Fibonacci();
        int a = 5;
        int b = 5;
        String str = "hello";
        String strone = "hello";
        System.out.println(str == strone);
        System.out.println(a == b);
        System.out.println(fibonacci == fibonacci1);
        System.out.println(fibonacci.equals(fibonacci1));
    }
}
