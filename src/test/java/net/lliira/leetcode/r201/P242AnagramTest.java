package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P242AnagramTest {
    private final P242Anagram solution = new P242Anagram();

    @Test
    public void tests() {
        test("anagram", "nagaram", true);
        test("rat", "cat", false);
    }

    private void test(final String p, final String q, final boolean expected) {
        final boolean result = this.solution.isAnagram(p, q);
        Assert.assertEquals(result, expected);
    }
}