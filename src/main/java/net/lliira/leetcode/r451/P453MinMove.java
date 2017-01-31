package net.lliira.leetcode.r451;

/**
 * Created by Jerric on 1/30/2017.
 */
public class P453MinMove {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            final int n = nums[i];
            if (n < min) min = n;
        }
        int count = 0;
        for (int i = 0; i < nums.length;  i++) {
            count += (nums[i] - min);
        }
        return count;
    }
}
