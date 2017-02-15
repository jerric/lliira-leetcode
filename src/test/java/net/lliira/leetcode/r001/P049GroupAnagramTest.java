package net.lliira.leetcode.r001;

import java.util.List;
import java.util.StringJoiner;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P049GroupAnagramTest {
    private final P049GroupAnagram solution = new P049GroupAnagram();

    @Test
    public void tests() {
        test(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"},
                list(list("eat", "tea","ate"), list("tan","nat"),list("bat")));
    }

    private void test(final String[] input, final List<List<String>> expected) {
        final List<List<String>> result = this.solution.groupAnagrams(input);
        Assert.assertEquals(result, expected);
    }
}