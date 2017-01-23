package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/18/2017.
 */
public class P020ParentheseTest {

    private final P020Parenthese solution = new P020Parenthese();

    @Test
    public void tests() {
        test("()[]{}", true);
        test("([)]", false);
    }

    private void test(final String s, final boolean expected) {
        final boolean result = this.solution.isValid(s);
        Assert.assertEquals(result, expected);
    }
}
