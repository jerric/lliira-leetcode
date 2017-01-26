package net.lliira.leetcode.r151;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P189RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums.length < 2) return;
        k %= nums.length;
        revert(nums, 0, nums.length);
        revert(nums, 0, k);
        revert(nums, k, nums.length);
    }

    private void revert(final int[] nums, int from, int to) {
        to--;
        while (from < to) {
            final int t = nums[from];
            nums[from++] = nums[to];
            nums[to--] = t;
        }
    }
}
