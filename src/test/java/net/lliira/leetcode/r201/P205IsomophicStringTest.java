package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P205IsomophicStringTest {
    private final P205IsomophicString solution = new P205IsomophicString();

    @Test
    public void tests() {
        test("egg", "add", true);
        test("foo", "bar", false);
        test("paper", "title", true);
    }

    private void test(final String a, final String t, final boolean expected) {
        final boolean result = this.solution.isIsomorphic(a, t);
        Assert.assertEquals(result, expected);
    }
}