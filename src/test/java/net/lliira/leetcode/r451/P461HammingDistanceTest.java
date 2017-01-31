package net.lliira.leetcode.r451;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P461HammingDistanceTest {
    private final P461HammingDistance solution = new P461HammingDistance();

    @Test
    public void tests() {
        test(1, 4, 2);
    }

    private void test(final int input, final int y, final int expected) {
        final int result = this.solution.hammingDistance(input, y);
        Assert.assertEquals(result, expected);
    }
}