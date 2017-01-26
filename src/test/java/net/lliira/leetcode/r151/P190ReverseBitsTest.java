package net.lliira.leetcode.r151;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P190ReverseBitsTest {
    private final P190ReverseBits solution = new P190ReverseBits();

    @Test
    public void tests() {
        test(Integer.MAX_VALUE - 1 , Integer.MAX_VALUE - 1 );
        test(43261596 , 964176192 );
    }

    private void test(final int a, final int expected) {
        final int result = this.solution.reverseBits(a);
        Assert.assertEquals(result, expected);
    }
}