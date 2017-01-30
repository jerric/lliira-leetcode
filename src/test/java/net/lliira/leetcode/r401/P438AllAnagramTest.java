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
public class P438AllAnagramTest {
    private final P438AllAnagram solution = new P438AllAnagram();

    @Test
    public void tests() {
        test("cbaebabacd", "abc", Arrays.asList(0, 6));
    }

    private void test(final String input, final String p, final List<Integer> expected) {
        final List<Integer> result = this.solution.findAnagrams(input, p);
        Assert.assertEquals(result, expected);
    }
}