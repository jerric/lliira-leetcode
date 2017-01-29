package net.lliira.leetcode.r351;

/**
 * Created by Jerric on 1/28/2017.
 */
public class P387FirstUnique {
    public int firstUniqChar(String s) {
        final int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            count[c] = (count[c] == 0) ? i + 1 : -1;
        }
        int min = 0;
        for (int c : count) if (c > 0 && (min == 0 || c < min)) min = c;
        return min - 1;
    }
}
