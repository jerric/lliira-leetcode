package net.lliira.leetcode.r001;

/**
 Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

 Your algorithm's runtime complexity must be in the order of O(log n).

 If the target is not found in the array, return [-1, -1].

 For example,
 Given [5, 7, 7, 8, 8, 10] and target value 8,
 return [3, 4].

 Show Company Tags
 Show Tags
 Show Similar Problems
 .
 */
public class P034SearchRange {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0 || nums[0] > target || nums[nums.length - 1] < target) return new int[]{-1, -1};
        final int start = search(nums, target, 0, nums.length);
        if (nums[start] != target) return new int[]{-1, -1};
        final int end = search(nums, target + 1, start + 1, nums.length);
        return new int[]{start, end - 1};
    }

    private int search(final int[] nums, final int target, int left, int right) {
        while (left < right) {
            final int mid = left + (right - left) / 2;
            if (nums[mid] < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
