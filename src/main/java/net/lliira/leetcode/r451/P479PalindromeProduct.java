package net.lliira.leetcode.r451;

/**
 * Created by Jerric on 2/2/2017.
 */
public class P479PalindromeProduct {
    public int largestPalindrome(int n) {
        if (n == 1) return 9;
        int lower = 1;
        for (int i = 1; i < n; i++) lower *= 10;
        final int power = lower * 10, upper = power - 1;
        final long max = (long)upper * upper;
        int left = upper - 1;
        while (left >= lower) {
            final long palindrome = make(left);
            for (long i = upper; i >= lower; i--) {
                if (palindrome / i > max || i * i < palindrome) break;
                if ((palindrome % i) == 0) return (int)(palindrome % 1337);
            }
            left--;
        }
        return 0;
    }

    private long make(int left) {
        long full = left;
        while (left > 0) {
            full = full * 10 + (left % 10);
            left /= 10;
        }
        return full;
    }
}
