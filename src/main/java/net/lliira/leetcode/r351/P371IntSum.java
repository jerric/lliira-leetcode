package net.lliira.leetcode.r351;

/**
 * Created by Jerric on 1/28/2017.
 */
public class P371IntSum {
    public int getSum(int a, int b) {
        return (b == 0) ? a : getSum(a ^ b, (a & b) << 1);
    }
}
