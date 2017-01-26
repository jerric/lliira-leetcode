package net.lliira.leetcode.r151;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P191NumBits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = (n < 0) ? 1 : 0;
        if (count == 1) n &= Integer.MAX_VALUE;
        while (n > 0) {
            if ((n & 1) == 1) count++;
            n >>= 1;
        }
        return count;
    }
}
