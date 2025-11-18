package com.practice.numberpractice;

import org.testng.annotations.Test;

/**
 * Unit test for calculating the minimum and maximum sum of (n-1) elements
 * from an integer array of size n.
 * <p>
 * The test prints two values:
 * - The minimum sum (total sum minus the largest element)
 * - The maximum sum (total sum minus the smallest element)
 */
public class MinMaxSumTest {

    /**
     * Test method to compute and print the minimum and maximum sum
     * by excluding the maximum and minimum element respectively.
     */
    @Test
    public void solution() {
        // Example input array
        int[] nums = {2, 7, 3, 4, 1, 6};

        long totalSum = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        // Calculate total sum, minimum, and maximum values
        for (int num : nums) {
            totalSum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // Minimum sum: exclude the largest element
        long minSum = totalSum - max;
        // Maximum sum: exclude the smallest element
        long maxSum = totalSum - min;

        // Output the results
        System.out.println(minSum + " " + maxSum);
    }
}