package com.practice;

import org.testng.annotations.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SwapString {
    @Test
    public void swapStrings() {
        String a = "Hello";
        String b = "World";

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        String c = b;
        b = a;
        a = c;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    @Test
    public void swapWordsInSentence() {
                String sentence = "I love Java programming";

                // Split the sentence into words
                String[] words = sentence.split(" ");

                // Reverse the words
                StringBuilder reversed = new StringBuilder();
                for (int i = words.length - 1; i >= 0; i--) {
                    reversed.append(words[i]);
                    System.out.println(" reversed: " + words[i]);
                    if (i != 0) { // Add space except after last word
                        reversed.append(" ");
                    }
                }

                // Print results
                System.out.println("Original: " + sentence);
                System.out.println("Swapped : " + reversed.toString());
            }

}
