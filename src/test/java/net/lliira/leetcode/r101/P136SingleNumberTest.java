package net.lliira.leetcode.r101;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P136SingleNumberTest {
    private final P136SingleNumber s = new P136SingleNumber();

    @Test
    public void t() {
        t(new int[]{1, 1, 2, 3, 3}, 2);
    }

    private void t(final int[] nums, final int e) {
        final int r = this.s.singleNumber(nums);
        Assert.assertEquals(r, e);
    }
}
