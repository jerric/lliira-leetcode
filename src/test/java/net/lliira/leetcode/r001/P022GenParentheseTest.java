package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/19/2017.
 */
public class P022GenParentheseTest {
    private final P022GenParenthese solution = new P022GenParenthese();

    @Test
    public void tests() {
        test(3, list("((()))", "(()())", "(())()", "()(())", "()()()"));
        test(4, list("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()"));
    }

    private void test(final int n, final List<String> expected) {
        final List<String> result = this.solution.generateParenthesis(n);
        Assert.assertEquals(result.size(), expected.size());
        for (int i = 0; i < result.size(); i++) {
            Assert.assertEquals(result.get(i), expected.get(i));
        }
    }
}
