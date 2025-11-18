package com.practice.reversepractice;

import org.testng.annotations.Test;

public class ReverseString {

    @Test
    public void reverseString() {
        String n = "Hel lo my name is Niti";

        String output = "";
        /*for(int i =0; i < n.length(); i++){
            output = n.charAt(i) + output;
        }
         */
        System.out.println("Print: " + n.length());
        for(int i= n.length()-1; i>=0; i--){
            output = output + n.charAt(i);
        }



        System.out.println("print reverse: " + output);
    }
}
