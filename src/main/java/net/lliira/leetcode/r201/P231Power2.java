package net.lliira.leetcode.r201;

/**
 * Created by Jerric on 1/26/2017.
 */
public class P231Power2 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while (n > 0) {
            if ((n & 1) == 1 & n > 1) return false;
            n >>= 1;
        }
        return true;
    }
}
