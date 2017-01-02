package net.lliira.leetcode;

/**
 * Created by Jerric on 1/1/2017.
 */
public class P009PalindromeNumber {
    static final int maxd = Integer.MAX_VALUE / 10, maxm = Integer.MAX_VALUE % 10;
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int r = 0, a= x;
        while (a > 0) {
            int d = a % 10;
            if (r >=maxd || r == maxd && d > maxm) return false;
            r = r * 10 + d;
            a /= 10;
        }
        return (r == x);
    }

}
