package net.lliira.leetcode.r251;

/**
 * Created by Jerric on 1/27/2017.
 */
public class P283MoveZero {
    public void moveZeroes(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            final int n = nums[i];
            if (n != 0) nums[p++] = n;
        }
        while (p < nums.length) nums[p++] = 0;
    }
}
