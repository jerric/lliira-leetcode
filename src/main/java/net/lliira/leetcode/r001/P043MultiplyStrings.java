package net.lliira.leetcode.r001;

/**
 Given two non-negative integers num1 and num2 represented as strings, return the product of num1
 and num2.

 Note:

 The length of both num1 and num2 is < 110.
 Both num1 and num2 contains only digits 0-9.
 Both num1 and num2 does not contain any leading zero.
 You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class P043MultiplyStrings {
    public String multiply(String num1, String num2) {
        final int[] buffer = new int[num1.length() + num2.length()];
        final String b = (num1.length() >= num2.length()) ? num1 : num2;
        final String m = (num1.length() >= num2.length()) ? num2 : num1;
        final int[] base = new int[b.length()];
        for (int i = 0; i < base.length; i++) base[i] = (b.charAt(b.length() - i - 1) - '0');
        for (int i = 0; i < m.length(); i++) {
            final int digit = m.charAt(m.length() - i - 1) - '0';
            int j = 0, remain = 0;
            for (; j < base.length; j++) {
                remain += digit * base[j] + buffer[i + j];
                buffer[i + j] = remain % 10;
                remain /= 10;
            }
            while (remain > 0) {
                remain += buffer[i + j];
                buffer[i + j] = remain % 10;
                remain /= 10;
                j++;
            }
        }
        // find the end
        int i = buffer.length - 1;
        while (i > 0 && buffer[i] == 0) i--;
        final StringBuilder builder = new StringBuilder(i + 1);
        while (i >= 0) builder.append(buffer[i--]);
        return builder.toString();
    }
}
