package net.lliira.leetcode.r001;

/**
 * Created by Jerric on 12/31/2016.
 */
public class P006ZigZag {
    public String convert(String s, int numRows) {
        final int len = s.length();
        if (numRows == 1 || len < 3) return s;

        final StringBuilder[] sbs = new StringBuilder[numRows];
        for (int idx = 0; idx < numRows; idx++) {
            sbs[idx] = new StringBuilder();
        }
        int i = 0;
        while (i < len) {
            // vertical down
            for (int idx = 0; idx < numRows && i < len; idx++) {
                sbs[idx].append(s.charAt(i++));
            }
            // obliquelly up
            for (int idx = numRows - 2; idx >= 1 && i < len; idx--) {
                sbs[idx].append(s.charAt(i++));
            }
        }
        for (int idx = 1; idx < numRows; idx++) {
            sbs[0].append(sbs[idx]);
        }

        return sbs[0].toString();
    }
}
