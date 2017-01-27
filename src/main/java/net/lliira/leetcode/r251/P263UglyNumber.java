package net.lliira.leetcode.r251;

/**
 * Created by Jerric on 1/27/2017.
 */
public class P263UglyNumber {
    private static final int[] DIV = {30, 15, 10, 6, 5, 3, 2};
    public boolean isUgly(int num) {
        if (num == 0) return false;
        if (num == 1) return true;
        for (final int d : DIV){
            while (num % d == 0) num /= d;
        }
        return (num == 1);
    }
}
