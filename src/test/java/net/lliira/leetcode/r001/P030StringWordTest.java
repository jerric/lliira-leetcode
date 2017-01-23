package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Jerric on 1/20/2017.
 */
public class P030StringWordTest {

    private final P030StringWord solution = new P030StringWord();

    @Test
    public void tests() {
        test("barfoothefoobarman", new String[]{"foo", "bar"}, Arrays.asList(0, 9));
    }

    private void test(final String s, final String[] words, final List<Integer> expected) {
        final List<Integer> result = this.solution.findSubstring(s, words);
        Assert.assertEquals(result, expected);
    }
}
