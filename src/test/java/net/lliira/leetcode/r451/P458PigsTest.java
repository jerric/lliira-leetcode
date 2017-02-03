package net.lliira.leetcode.r451;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P458PigsTest {
    private final P458Pigs solution = new P458Pigs();

    @Test
    public void tests() {
        test(3, 5, 10, 1);
        test(3, 7, 10, 2);
    }

    private void test(final int input, final int toDie, final int toTest, final int expected) {
        final int result = this.solution.poorPigs(input, toDie, toTest);
        Assert.assertEquals(result, expected);
    }
}