package net.lliira.leetcode.r151;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P169MajorElementTest {
    private final P169MajorElement solution = new P169MajorElement();

    @Test
    public void tests() {
        test(new int[]{2, 3, 1, 1, 4, 1, 1}, 1);
    }

    private void test(final int[] nums, final int expected) {
        final int result = this.solution.majorityElement(nums);
        Assert.assertEquals(result, expected);
    }
}