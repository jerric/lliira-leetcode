package net.lliira.leetcode.r051;

/**
 * Created by Jerric on 1/23/2017.
 */
public class P070ClimbStairs {
    public int climbStairs(int n) {
        if (n <= 3) return n;
        int pp = 2, p = 3;
        for (int i = 4; i <= n; i++) {
            final int v = pp + p;
            pp = p;
            p = v;
        }
        return p;
    }
}
