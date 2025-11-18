package com.practice.practiceSingletone;

public class Runner {
    public static void main(String[] args) {
        MySingletonClass d1 = MySingletonClass.x();
        System.out.println(d1);

        MySingletonClass d2 = MySingletonClass.x();
        System.out.println(d2);
    }
}
