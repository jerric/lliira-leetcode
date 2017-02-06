package net.lliira.leetcode.r001;

/**
 Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed)
 parentheses substring.

 For "(()", the longest valid parentheses substring is "()", which has length = 2.

 Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 */
public class P032LongestParenthese {
    public int longestValidParentheses(String s) {
        int max = 0, current = 0, pos = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (current == 0) {
                    max = Math.max(max, current);
                    pos = -1;
                }
                else current--;
            } else {
                if (pos == -1) pos = i;
                current++;
            }
        }
        while (current > 0 && current < s.length()) {

        }
    }
}
