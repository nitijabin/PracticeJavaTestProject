package com.practice;

import org.testng.annotations.Test;

@Test
public class CountLastWordInArrayTest {

    public void countLastWord() {
        String word = "   Hello World   ";
        System.out.println(word);
        // word = word.trim();
        //System.out.println(word + (word.length() - 1));
        char[] wordArray= word.toCharArray();
        //char ch = ' ';
        int count = 0;

        for (int i = (wordArray.length - 1); i >= 0; i--) {
            if (wordArray[i] != ' ') {
                count++;
            } else {
                // count should >0 so that if the last world has space it should not add it
                if (count > 0) {
                    System.out.println("count: " + count);
                    break;
                }
            }
        }
    }
}
