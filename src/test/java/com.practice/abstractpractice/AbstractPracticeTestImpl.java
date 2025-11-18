package com.practice.abstractpractice;

public class AbstractPracticeTestImpl extends AbstractPracticeTest{

    public AbstractPracticeTestImpl(String input) {
        super(input);
    }

    @Override
    public String methodOne() {
        return "Method One from abstract practice test impl.";
    }
}
