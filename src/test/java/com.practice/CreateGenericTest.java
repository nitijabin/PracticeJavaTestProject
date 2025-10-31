package com.practice;

public class CreateGenericTest <T>{
    T myObj;
    CreateGenericTest(T myObj){
        this.myObj = myObj;
    }
    public T getMyObj(){
        return myObj;
    }
}

class Test{
    public static void main(String [] args){

        CreateGenericTest<String> myClassObj = new CreateGenericTest<>("Hello" );
        CreateGenericTest<Integer> myIntObj = new CreateGenericTest<>(34 );

        System.out.println("Object value: " + myClassObj.getMyObj());
        System.out.println("Object value: " + myIntObj.getMyObj());

    }

}
