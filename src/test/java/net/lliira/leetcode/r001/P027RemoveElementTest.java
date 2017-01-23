package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by jerricg on 1/19/17.
 */
public class P027RemoveElementTest {
    private final P027RemoveElement solution = new P027RemoveElement();

    @Test
    public void tests() {
        test(new int[] {1, 1, 2}, 1, 1);
    }

    private void test(final int[] nums, final int n, final int expected) {
        final int result = this.solution.removeElement(nums, n);
        Assert.assertEquals(result, expected);
    }
}
