package net.lliira.leetcode.r251;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P268MissingNumberTest {
    private final P268MissingNumber solution = new P268MissingNumber();

    @Test
    public void tests() {
        test(new int[] {0, 1, 3}, 2);
    }

    private void test(final int[] input, final int expected) {
        final int result = this.solution.missingNumber(input);
        Assert.assertEquals(result, expected);
    }
}