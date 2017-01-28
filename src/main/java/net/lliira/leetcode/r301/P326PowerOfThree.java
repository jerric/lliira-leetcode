package net.lliira.leetcode.r301;

/**
 * Created by Jerric on 1/28/2017.
 */
public class P326PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n > 1) {
            if (n % 3 != 0) return false;
            n /= 3;
        }
        return true;
    }
}
