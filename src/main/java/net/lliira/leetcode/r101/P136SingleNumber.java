package net.lliira.leetcode.r101;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P136SingleNumber {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (final int n : nums) xor ^= n;
        return xor;
    }
}
