package net.lliira.leetcode.r051;

/**
 Find the contiguous subarray within an array (containing at least one number) which has the
 largest sum.

 For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 the contiguous subarray [4,-1,2,1] has the largest sum = 6.

 click to show more practice.

 More practice:
 If you have figured out the O(n) solution, try coding another solution using the divide and
 conquer approach, which is more subtle.
 */
public class P053MaxSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int max = Integer.MIN_VALUE, sum = 0;
        for (final int n : nums) {
            sum = Math.max(n, sum + n);
            max = Math.max(max, sum);
        }
        return max;
    }
}
