package net.lliira.leetcode.r451;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P485MaxConsecutiveTest {
    private final P485MaxConsecutive solution = new P485MaxConsecutive();

    @Test
    public void tests() {
        test(new int[]{1,1,0,1,1,1}, 3);
    }

    private void test(final int[] input, final int expected) {
        final int result = this.solution.findMaxConsecutiveOnes(input);
        Assert.assertEquals(result, expected);
    }
}