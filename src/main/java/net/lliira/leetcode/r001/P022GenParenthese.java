package net.lliira.leetcode.r001;

import java.util.LinkedList;
import java.util.List;

/**
 Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 For example, given n = 3, a solution set is:

 [
 "((()))",
 "(()())",
 "(())()",
 "()(())",
 "()()()"
 ]
 */
public class P022GenParenthese {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        combine(result, "(",1,0, n);
        return result;
    }

    private void combine(final List<String> result, final String s, final int left, final int right, final int n) {
        if (left == right && left == n) result.add(s);
        else {
            if (left < n) combine(result, s + "(", left + 1, right, n);
            if (right < left) combine(result, s + ")", left, right + 1, n);
        }
    }
}
