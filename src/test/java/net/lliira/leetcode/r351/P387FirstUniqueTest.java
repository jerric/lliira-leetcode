package net.lliira.leetcode.r351;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P387FirstUniqueTest {
    private final P387FirstUnique solution = new P387FirstUnique();

    @Test
    public void tests() {
        test("", -1);
        test("leetcode", 0);
        test("loveleetcode", 2);
    }

    private void test(final String input, final int expected) {
        final int result = this.solution.firstUniqChar(input);
        Assert.assertEquals(result, expected);
    }
}