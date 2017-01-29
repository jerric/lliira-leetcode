package net.lliira.leetcode.r351;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P383RansomNoteTest {
    private final P383RansomNote solution = new P383RansomNote();

    @Test
    public void tests() {
        test("a", "b", false);
        test("aa", "ab", false);
        test("aa", "aab", true);
    }

    private void test(final String input, final String magazine, final boolean expected) {
        final boolean result = this.solution.canConstruct(input, magazine);
        Assert.assertEquals(result, expected);
    }
}