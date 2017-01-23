package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Jerric on 1/16/2017.
 */
public class P017LettersPhoneTest {
    private final P017LettersPhone solution = new P017LettersPhone();

    @Test
    public void tests() {
        test("23", Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    }

    private void test(final String digits, final List<String> combo) {
        final Set<String> results = new HashSet<>(this.solution.letterCombinations(digits));
        final Set<String> expected = new HashSet<>(combo);
        Assert.assertEquals(results.size(), expected.size());
        for (final String str : results) {
            Assert.assertTrue(expected.contains(str));
        }
    }
}
