package net.lliira.leetcode.r401;

/**
 * Created by Jerric on 1/29/2017.
 */
public class P405Hex {
    private static final char[] MAP = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] buffer = null;
        for (int i = 7; i >= 0; i--) {
            final int p = (num >> (i * 4)) & 15;
            if (buffer == null) {
                if (p == 0) continue;
                else buffer = new char[i + 1];
            }
            buffer[buffer.length - i - 1] = MAP[p];
        }
        return new String(buffer);
    }
}
