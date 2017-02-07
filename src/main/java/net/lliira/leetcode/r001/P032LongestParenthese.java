package net.lliira.leetcode.r001;

/**
 Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed)
 parentheses substring.

 For "(()", the longest valid parentheses substring is "()", which has length = 2.

 Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 */
public class P032LongestParenthese {

    public int longestValidParentheses(String s) {
        int max = 0;
        Stack top = new Stack(-1, null);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') top = new Stack(i, top);
            else {
                top = top.previous;
                if (top == null) top = new Stack(i, null);
                else max = Math.max(max, i - top.pos);
            }
        }
        return max;
    }

    private static class Stack {
        final int pos;
        Stack previous;
        Stack(final int pos, final Stack previous) {
            this.pos = pos;
            this.previous = previous;
        }
    }
}
