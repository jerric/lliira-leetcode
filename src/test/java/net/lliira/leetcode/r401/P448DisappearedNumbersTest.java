package net.lliira.leetcode.r401;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P448DisappearedNumbersTest {
    private final P448DisappearedNumbers solution = new P448DisappearedNumbers();

    @Test
    public void tests() {
        test(new int[]{4,3,2,7,8,2,3,1}, Arrays.asList(5, 6));
    }

    private void test(final int[] input, final List<Integer> expected) {
        final List<Integer> result = this.solution.findDisappearedNumbers(input);
        Assert.assertEquals(result, expected);
    }
}