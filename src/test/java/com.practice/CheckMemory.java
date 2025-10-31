package com.practice;

import org.testng.annotations.Test;

@Test
public class CheckMemory {
    public void check(){
        Fibonacci fibonacci = new Fibonacci();
        Fibonacci fibonacci1 = new Fibonacci();

        System.out.println(fibonacci==fibonacci1);
        System.out.println(fibonacci.equals(fibonacci1));
    }
}
