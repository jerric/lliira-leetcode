package net.lliira.leetcode.r001;

/**
 * Created by Jerric on 1/22/2017.
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
