package com.practice.practiceSingletone;

public class MySingletonClass {

    private static MySingletonClass c;

    //for the Singleton class the constructor should be private
    private MySingletonClass() {

    }

    public static MySingletonClass x() {
        if(c==null) {
            c = new MySingletonClass();
        }
        return c;
    }

}
