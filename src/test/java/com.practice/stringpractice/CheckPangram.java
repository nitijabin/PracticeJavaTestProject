package com.practice.stringpractice;

public class CheckPangram {
    public static boolean isPangram(String str){
        if(str.length()<26)
            return false;
        for(char i = 'a'; i<='z'; i++){
            if(str.toLowerCase().indexOf(i)<0)
             return false;
            else
                System.out.println("index of ch: " + i +" "+ str.toLowerCase().indexOf(i));
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        if(isPangram(str))
            System.out.println(str + " is a pangram");
        else System.out.println(str + " is NOT a Pangram");
    }
}
