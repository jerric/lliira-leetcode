package net.lliira.leetcode.r051;

/**
 Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Determine if you are able to reach the last index.

 For example:
 A = [2,3,1,1,4], return true.

 A = [3,2,1,0,4], return false.
 */
public class P055JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length < 2) return true;
        final int last = nums.length - 1;
        int max = 0;
        for (int i = 0; i < last; i++) {
            final int pos = i + nums[i];
            if (max < pos) max = pos;
            else if (max == i) return false;
        }
        return true;
    }
}
