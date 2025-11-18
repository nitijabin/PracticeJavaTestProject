package com.practice.abstractpractice;

public abstract class AbstractPracticeTest {
    private String input ;

    public AbstractPracticeTest(String input){
        this.input = input;
    }
    public abstract String methodOne();
    public void methodTwo(){
        System.out.println("In side the Method two");
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
