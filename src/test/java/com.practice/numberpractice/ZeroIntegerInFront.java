package com.practice.numberpractice;

import java.util.ArrayList;

public class ZeroIntegerInFront {

    public static void main(String[] args) {
        int[] arr = {34, 0, 9, 5, 7, 4, 0, 4, 0, 23};
        int index = arr.length - 1;
        System.out.println("Index : " + index);
        // Move non-zero values to the END
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                System.out.println(index + " " +arr[index]);
                index--;
            }
        }

        // Fill the remaining front positions with 0
        while (index >= 0) {
            arr[index] = 0;
            index--;
        }

        // Print result
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
