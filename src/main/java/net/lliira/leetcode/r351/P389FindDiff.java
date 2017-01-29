package net.lliira.leetcode.r351;

/**
 * Created by Jerric on 1/28/2017.
 */
public class P389FindDiff {
    public char findTheDifference(String s, String t) {
        final int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) count[s.charAt(i)] += 1;
        for (int i = 0; i < t.length(); i++) {
            final char c = t.charAt(i);
            final int n = count[c];
            if (n == 0) return c;
            count[c] = n - 1;
        }
        return ' ';
    }
}
