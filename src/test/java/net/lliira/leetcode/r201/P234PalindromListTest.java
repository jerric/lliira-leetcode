package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P234PalindromListTest {
    private final P234PalindromList solution = new P234PalindromList();

    @Test
    public void tests() {
        test(link(1,1), true);
        test(link(1, 2, 3, 2, 1), true);
        test(link(1, 2, 3, 4, 1), false);
        test(link(1, 2, 3, 3, 2, 1), true);
    }

    private void test(final ListNode input, final boolean expected) {
        final boolean result = this.solution.isPalindrome(input);
        Assert.assertEquals(result, expected);
    }
}