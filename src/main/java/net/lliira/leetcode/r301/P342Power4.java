package net.lliira.leetcode.r301;

/**
 * Created by Jerric on 1/28/2017.
 */
public class P342Power4 {
    public boolean isPowerOfFour(int num) {
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
    }
}
