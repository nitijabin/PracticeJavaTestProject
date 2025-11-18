package com.practice.numberpractice;

import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;

/**
 * Unit test for the Two Sum problem.
 * <p>
 * Given an array of integers and a target value, finds two indices such that
 * the numbers at those indices add up to the target.
 */
@Test
public class TwoSumTest {

    /**
     * Test method to verify the twoSum logic.
     * Prints the indices of the two numbers that add up to the target.
     */
    @Test
    public void runTwoSum() {
        int[] nums = {2, 6, 9, 11};
        int target = 20;
        int[] result = twoSum(nums, target);
        System.out.println("Result: " + result[0] + " and " + result[1]);
    }

    /**
     * Finds two indices in the array such that their values add up to the target.
     *
     * @param nums   the input array of integers
     * @param target the target sum
     * @return an array containing the two indices, or an empty array if no solution is found
     */
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> map = new HashMap<>();
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                System.out.println("Found complement at index: " + map.get(complement));
                return new int[]{map.get(complement), i};
            }
            // Store the current number and its index in the map
            map.put(nums[i], i);
            System.out.println("Current map state: " + map);
        }

        // Return empty array if no solution is found
        return new int[0];
    }

/*
            int[] result = new int[2];
            for (int i = 0; i < nums.length-1; i++) {
                for(int j = (i+1); j<nums.length; j++) {
                    if ((nums[i] + nums[j]) == target) {
                        result[0] = nums[i];
                        result[1] = nums[j];
                        break;
                    }
                }
            }
            return result;
 */

}