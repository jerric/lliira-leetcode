package net.lliira.leetcode.r001;

/**
 Given an unsorted integer array, find the first missing positive integer.

 For example,
 Given [1,2,0] return 3,
 and [3,4,-1,1] return 2.

 Your algorithm should run in O(n) time and uses constant space.
 */
public class P041FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            final int val = nums[i];
            final int p = val - 1;
            if (i == p || val <= 0 || val > nums.length || nums[p] == val) i++;
            else {
                nums[i] = nums[p];
                nums[p] = val;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) return i + 1;
        }
        return nums.length + 1;
    }
}
