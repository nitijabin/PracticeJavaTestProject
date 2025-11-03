package com.practice.interfacePractice;

public class MyInterfacePracticeImpl implements MyInterfacePractice {

    @Override
    public void myMethod() {
        System.out.println("This is my method");
    }

    @Override
    public void myAbstractMethod() {
        System.out.println("this is my abstract method.");
    }

    public static void main(String[] args) {
        MyInterfacePracticeImpl obj = new MyInterfacePracticeImpl();
        obj.myMethod();
        obj.mySecondMethod();
        obj.myAbstractMethod();
        MyInterfacePractice.myThirdMethod();
    }
}
