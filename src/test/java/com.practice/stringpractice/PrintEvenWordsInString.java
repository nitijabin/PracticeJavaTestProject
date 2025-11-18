package com.practice.stringpractice;

import java.util.Arrays;

public class PrintEvenWordsInString {

    public void PrintEvenWord(String str) {
        String[] strSplit = str.split(" ");

//        Arrays.stream(strSplit).forEach(s -> {
//            if (isEven(s.length()))
//                System.out.println("\"" + s + "\"" + " is an even and length is " + s.length());
//            else
//                System.out.println(("\"" + s + "\"" + " is a odd and length is " + s.length()));
//        });
        Arrays.stream(strSplit).filter(s->s.length()%2==0).forEach(System.out::println);
    }

    public boolean isEven(int count) {
        return (count % 2 == 0);
    }

    public static void main(String[] args) {
        PrintEvenWordsInString printEvenWordsInString = new PrintEvenWordsInString();
        printEvenWordsInString.PrintEvenWord("My name is not Yusra");
    }
}
