package com.practice;

public class LongestConsecutiveOccurenceExample {
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 4, 2, 6, 7, 8};
        System.out.println("Length of the longest consecutive subsequence is: " + findLongestConsecutiveSubsequence(arr));
    }

    public static int findLongestConsecutiveSubsequence(int[] arr) {
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                System.out.println("arr[i]: " + arr[i] + " arr[i-1]: " + arr[i - 1]);
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                System.out.println(" MaxLength: " + maxLength);
                System.out.printf(" Current Length: " + currentLength);
                currentLength = 1; // reset for the next sequence
            }
        }
        return Math.max(maxLength, currentLength);
    }

}
