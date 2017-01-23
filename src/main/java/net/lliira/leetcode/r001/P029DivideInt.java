package net.lliira.leetcode.r001;

/**
 * Created by Jerric on 1/20/2017.
 */
public class P029DivideInt {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) return (dividend >= 0) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        final int sign = ((dividend >= 0 && divisor > 0) || (dividend < 0 && divisor < 0)) ? 1 : -1;
        long dd = (dividend < 0) ? dividend * -1L : dividend;
        long dv = (divisor < 0) ? divisor * -1L : divisor;
        long n = (dv == 1) ? dd : divide(dd, dv);
        n *= sign;
        return (n > Integer.MAX_VALUE) ? Integer.MAX_VALUE : (n < Integer.MIN_VALUE) ? Integer.MIN_VALUE : (int)n;
    }

    private long divide(final long dd, final long dv) {
        if (dd < dv) return 0;
        // find the largest multiple
        long sum = dv;
        int multiple = 1;
        while ((sum + sum) <= dd) {
            sum += sum;
            multiple += multiple;
        }
        return multiple + divide(dd - sum, dv);
    }
}
