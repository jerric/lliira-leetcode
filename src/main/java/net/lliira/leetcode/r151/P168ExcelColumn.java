package net.lliira.leetcode.r151;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P168ExcelColumn {
    public String convertToTitle(int n) {
        if (n <= 0) return null;
        final StringBuilder builder = new StringBuilder();
        while (n > 0) {
            n--;
            builder.append((char)('A' + (n % 26)));
            n /= 26;
        }
        return builder.reverse().toString();
    }
}
