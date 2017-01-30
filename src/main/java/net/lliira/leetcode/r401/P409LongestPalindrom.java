package net.lliira.leetcode.r401;

/**
 * Created by Jerric on 1/29/2017.
 */
public class P409LongestPalindrom {
    public int longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return 0;
        final int[] count = new int[52];
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            final int idx = (c >= 'A' && c <= 'Z') ? c - 'A' + 26 : c - 'a';
            count[idx] += 1;
        }
        int sum = 0;
        boolean odd = false;
        for (int n : count) {
            if ((n & 1) == 1) {
                sum += n - 1;
                odd = true;
            } else sum += n;
        }
        if (odd) sum++;
        return sum;
    }
}
