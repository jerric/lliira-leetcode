package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by jerricg on 1/19/17.
 */
public class P026RemoveDupTest {
    private final P026RemoveDup solution = new P026RemoveDup();

    @Test
    public void tests() {
        test(new int[] {1, 1, 2}, 2);
    }

    private void test(final int[] nums, final int expected) {
        final int result = this.solution.removeDuplicates(nums);
        Assert.assertEquals(result, expected);
    }
}
