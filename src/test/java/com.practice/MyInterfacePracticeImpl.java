package com.practice;

public class MyInterfacePracticeImpl implements MyInterfacePractice {

    @Override
    public void myMethod() {
        System.out.println("This is my method");
    }

    @Override
    public void myAbstractMethod() {
        
    }

    public static void main(String[] args) {
        MyInterfacePracticeImpl obj = new MyInterfacePracticeImpl();
        obj.myMethod();
        obj.mySecondMethod();
        MyInterfacePractice.myThirdMethod();
    }
}
