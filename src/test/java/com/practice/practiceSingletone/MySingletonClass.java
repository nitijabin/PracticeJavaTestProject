package com.practice.practiceSingletone;

public class MySingletonClass {

    private static MySingletonClass c;

    private MySingletonClass() {

    }

    public static MySingletonClass x() {
        if(c==null) {
            c = new MySingletonClass();
        }
        return c;
    }

}
