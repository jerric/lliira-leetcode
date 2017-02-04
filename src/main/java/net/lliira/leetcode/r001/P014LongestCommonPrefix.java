package net.lliira.leetcode.r001;

/**
 Write a function to find the longest common prefix string amongst an array of strings.
 */
public class P014LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        final String first = strs[0];
        int i = 0;
        while (i < first.length()) {
            final char c = first.charAt(i);
            for (int t = 1; t < strs.length; t++) {
                final String s = strs[t];
                if (i == s.length()) return s;
                if (s.charAt(i) != c) return first.substring(0, i);
            }
            i++;
        }
        return first;
    }
}
