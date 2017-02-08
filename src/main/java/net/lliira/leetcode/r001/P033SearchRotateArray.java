package net.lliira.leetcode.r001;

/**
 Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 You are given a target value to search. If found in the array return its index, otherwise return -1.

 You may assume no duplicate exists in the array.
 */
public class P033SearchRotateArray {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return (nums[0] == target) ? 0 : -1;
        int left = 0, right = nums.length - 1;
        while (nums[left] > nums[right]) {
            final int mid = left + (right - left) / 2;
            if (nums[mid] >= nums[left]) left = mid + 1;
            else right = mid;
        }
        // new left points to the smallest element
        if (target > nums[nums.length - 1]) {
            right = left - 1;
            left = 0;
        } else {
            right = nums.length - 1;
        }
        while (left <= right) {
            final int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}
