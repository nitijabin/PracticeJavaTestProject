package com.practice;

public abstract class MyAbstractPractice {
    abstract String myAbstractMethod();

    public void myConcreteMethod(){
        System.out.println("This is my concrete method");
    }

    public static void main(String[] args) {
        // MyAbstractPractice obj = new MyAbstractPractice(); // This will give error
        MyAbstractPracticeImpl obj = new MyAbstractPracticeImpl();
        System.out.println(obj.myAbstractMethod());
        obj.myConcreteMethod();
    }
}
