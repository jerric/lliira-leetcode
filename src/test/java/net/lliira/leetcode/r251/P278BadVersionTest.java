package net.lliira.leetcode.r251;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P278BadVersionTest {
    private final P278BadVersion solution = new P278BadVersion();

    @Test
    public void tests() {
        test(2126753390, 1702766719);
        test(5, 3);
        test(6, 3);
    }

    private void test(final int input, final int expected) {
        this.solution.setBadVersion(expected);
        final int result = this.solution.firstBadVersion(input);
        Assert.assertEquals(result, expected);
    }
}