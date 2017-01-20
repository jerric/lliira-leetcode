package net.lliira.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jerric on 1/19/2017.
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
