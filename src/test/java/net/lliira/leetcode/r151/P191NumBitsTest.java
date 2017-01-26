package net.lliira.leetcode.r151;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P191NumBitsTest {
    private final P191NumBits solution = new P191NumBits();

    @Test
    public void tests() {
        test(11, 3);
    }

    private void test(final int a, final int expected) {
        final int result = this.solution.hammingWeight(a);
        Assert.assertEquals(result, expected);
    }
}