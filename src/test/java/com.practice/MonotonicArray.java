package com.practice;

public class MonotonicArray {
    public static void main(String[] args) {

        boolean increasing = true, decreasing = true;
        int[] arr = { 5, 3,2,1};
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] > arr[i]) {
                decreasing = false;
            }
            if (arr[i - 1] < arr[i]) {
                increasing = false;
            }
        }
        if (decreasing || increasing) {
            System.out.println("Monotonic.");
        }else {
            System.out.println("not monotonic.");
        }
    }
}
