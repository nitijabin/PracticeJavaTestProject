package com.practice;

import java.util.Arrays;

public class MergeSortedArrayTest {
    public static void mergeArray(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println("Output: " + Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {1};
        mergeArray(nums1, 0, nums2, 1);
    }
}
