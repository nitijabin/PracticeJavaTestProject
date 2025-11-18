package com.practice.interfacepractice;

public interface MyInterfacePractice {

    /*
      in interface all methods are abstract by default
      in interface we cannot have constructor
      in interface we cannot have instance variables
      in interface we cannot have static methods (only from Java 8 we can have static methods in interface)
      in interface we cannot have concrete methods (only from Java 8 we can have default
      in interface all variables are public static final by default
      in interface all methods are public abstract by default
    */
    int myVar = 10;
    //public static final int myVar = 10;

    void myMethod();
    void myAbstractMethod();

    default void mySecondMethod() {
        System.out.println("This is my second method");
    }

    static void myThirdMethod() {
        System.out.println("This is my third method");
    }
}


