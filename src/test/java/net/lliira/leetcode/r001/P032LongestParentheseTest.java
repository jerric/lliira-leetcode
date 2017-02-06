package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P032LongestParentheseTest {
    private final P032LongestParenthese solution = new P032LongestParenthese();

    @Test
    public void tests() {
        test("(()", 2);
        test(")()())", 4);
    }

    private void test(final String input, final int expected) {
        final int result = this.solution.longestValidParentheses(input);
        Assert.assertEquals(result, expected);
    }
}