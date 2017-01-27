package net.lliira.leetcode.r251;

/**
 * Created by Jerric on 1/27/2017.
 */
public class P268MissingNumber {
    public int missingNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
        }
        return xor ^ nums.length;
    }
}
