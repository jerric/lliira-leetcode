package net.lliira.leetcode.r001;

/**
 * Created by Jerric on 2/7/2017.
 */
public class P033SearchRotateArray {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            final int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid < target])
        }
    }
}
