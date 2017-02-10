package net.lliira.leetcode.r001;

/**
 The count-and-say sequence is the sequence of integers beginning as follows:
 1, 11, 21, 1211, 111221, ...

 1 is read off as "one 1" or 11.
 11 is read off as "two 1s" or 21.
 21 is read off as "one 2, then one 1" or 1211.
 Given an integer n, generate the nth sequence.

 Note: The sequence of integers will be represented as a string.

 */
public class P038CountSay {
    public String countAndSay(int n) {
        if (n < 1) return "";
        String result = "1";
        for (int i = 1; i < n; i++) {
            final StringBuilder buffer = new StringBuilder();
            final int upper = result.length() - 1;
            for (int j = 0; j < result.length();) {
                final char c = result.charAt(j);
                int count = 1;
                while (++j < result.length() && result.charAt(j) == c) count++;
                buffer.append(count).append(c);
            }
            result = buffer.toString();
        }
        return result;
    }
}
