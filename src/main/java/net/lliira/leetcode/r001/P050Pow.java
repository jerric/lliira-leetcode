package net.lliira.leetcode.r001;

/**
 Implement pow(x, n).
 */
public class P050Pow {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (x == 1) return 1;
        final boolean even = (n % 2 == 0);
        if (x == -1) return even ? 1 : -1;

        final boolean posn = (n > 0);
        final long ln = (posn) ? n : -1L * n;
        final boolean negx = (x < 0 && !even);
        if (x < 0) x = -x;

        double total = x;
        for (long i = 1; i < ln && total > 0 && total < Double.MAX_VALUE; i++) {
            total = (total >= Double.MAX_VALUE / x) ? Double.MAX_VALUE : total * x;
        }
        if (total == 0) return (posn) ? 0 : Double.POSITIVE_INFINITY;
        if (total == Double.MAX_VALUE && !posn) return 0;
        if (!posn) total = 1 / total;
        if (negx) total = -total;
        return total;
    }
}
