package net.lliira.leetcode;

/**
 * Created by Jerric on 12/31/2016.
 */
public class P006ZigZag {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() < 4) return s;
        final int step = (numRows == 2) ? 3 : numRows * 2 - 2;
        final int offset = s.length() / step;
        final int r = numRows - 1;
        final char[] result = new char[s.length()];
        for (int t = 0; t < step; t++) {
            final int p = (t == 0 || numRows == 2) ? t : ((t-1) / r + 2 * ((t-1) % r) + 1);
            int idx = p * offset;
            for (int i = 0; i < s.length(); i += step) {
                final int src = i + t;
                if (src < s.length()) {
                    result[idx++] = s.charAt(src);
                }
            }
        }
        return new String(result);
    }
}
