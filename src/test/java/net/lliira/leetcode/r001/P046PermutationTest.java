package net.lliira.leetcode.r001;

import java.util.List;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]

 */
public class P046PermutationTest {
    private final P046Permutation solution = new P046Permutation();

    @Test
    public void tests() {
        test(new int[]{1, 2, 3}, list(list(1,2,3),
        list(1,3,2),
        list(2,1,3),
        list(2,3,1),
        list(3,1,2),
        list(3,2,1)));
    }

    private void test(final int[] input, final List<List<Integer>> expected) {
        final List<List<Integer>> result = this.solution.permute(input);
        Assert.assertEquals(result, expected);
    }
}