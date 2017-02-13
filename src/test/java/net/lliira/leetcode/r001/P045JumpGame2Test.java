package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P045JumpGame2Test {
    private final P045JumpGame2 solution = new P045JumpGame2();

    @Test
    public void tests() {
        test(new int[]{2,3,1,1,4}, 2);
    }

    private void test(final int[] input, final int expected) {
        final int result = this.solution.jump(input);
        Assert.assertEquals(result, expected);
    }
}