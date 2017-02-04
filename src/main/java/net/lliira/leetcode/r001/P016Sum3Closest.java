package net.lliira.leetcode.r001;

import java.util.Arrays;

/**
 Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 Return the sum of the three integers. You may assume that each input would have exactly one solution.

 For example, given array S = {-1 2 1 -4}, and target = 1.

 The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class P016Sum3Closest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = 0;
        int min = Integer.MAX_VALUE;
        int i = nums.length - 1;
        while (i >= 2) {
            final int n = nums[i];
            int left = 0, right = i - 1;
            int nl = nums[left], nr = nums[right];
            while (left < right) {
                final int sum = n + nl + nr;
                final int diff = Math.abs(sum - target);
                if (min > diff) {
                    min = diff;
                    result = sum;
                }

                if (sum == target) return target;
                else if (sum < target) {
                    while (left < right && nums[left] == nl) left++;
                    nl = nums[left];
                }
                else {
                    while (left < right && nums[right] == nr) right--;
                    nr = nums[right];
                }
            }
            while (i >= 2 && nums[i] == n) i--;
        }
        return result;
    }
}
