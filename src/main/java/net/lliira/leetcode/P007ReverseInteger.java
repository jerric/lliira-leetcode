package net.lliira.leetcode;

/**
 * Created by Jerric on 1/1/2017.
 */
public class P007ReverseInteger {
    public int reverse(int x) {
        final boolean neg;
        if (x < 0) {
            x *= -1;
            neg = true;
        } else neg = false;

        long r = 0;
        while (x > 0) {
            r = r * 10 + x % 10;
            if (r > Integer.MAX_VALUE) return 0;
            x /= 10;
        }
        if (neg) r *= -1;
        return (int) r;
    }
}
