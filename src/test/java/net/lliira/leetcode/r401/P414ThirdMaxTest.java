package net.lliira.leetcode.r401;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P414ThirdMaxTest {
    private final P414ThirdMax solution = new P414ThirdMax();

    @Test
    public void tests() {
        test(new int[]{2, 2, 3, 1}, 1);
        test(new int[]{3, 1, 2, 5, 7}, 3);
        test(new int[]{3, 1, 2}, 1);
        test(new int[]{3, 2}, 3);
    }

    private void test(final int[] input, final int expected) {
        final int result = this.solution.thirdMax(input);
        Assert.assertEquals(result, expected);
    }
}