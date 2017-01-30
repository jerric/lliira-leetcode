package net.lliira.leetcode.r401;

/**
 * Created by Jerric on 1/30/2017.
 */
public class P415AddString {
    public String addStrings(String num1, String num2) {
        if (num1 == null || num1.isEmpty()) return num2;
        if (num2 == null || num1.isEmpty()) return num1;
        final StringBuilder builder = new StringBuilder(Math.max(num1.length(), num2.length()) + 1);
        int i = num1.length() - 1, j = num2.length() - 1, remain = 0;
        while (i >= 0 || j >= 0 || remain > 0) {
            if (i >= 0) remain += (num1.charAt(i--) - '0');
            if (j >= 0) remain += (num2.charAt(j--) - '0');
            builder.append(remain % 10);
            remain /= 10;
        }
        return builder.reverse().toString();
    }
}
