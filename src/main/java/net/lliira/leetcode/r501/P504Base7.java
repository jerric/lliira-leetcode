package net.lliira.leetcode.r501;

/**
 Given an integer, return its base 7 string representation.

 Example 1:
 Input: 100
 Output: "202"
 Example 2:
 Input: -7
 Output: "-10"
 Note: The input will be in range of [-1e7, 1e7].
 */
public class P504Base7 {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        final StringBuilder builder = new StringBuilder();
        final boolean sign;
        if (num < 0) {
            sign = false;
            if (num == Integer.MIN_VALUE) {
                final long n = -1L * num;
                builder.append(n % 7);
                num = (int)(n / 7);
            } else num = -num;
        } else sign = true;
        while (num > 0) {
            builder.append(num % 7);
            num /= 7;
        }
        if (!sign) builder.append('-');
        return builder.reverse().toString();
    }
}
