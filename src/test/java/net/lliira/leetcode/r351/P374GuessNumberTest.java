package net.lliira.leetcode.r351;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P374GuessNumberTest {
    private final P374GuessNumber solution = new P374GuessNumber();

    @Test
    public void tests() {
        test(10, 6);
        test(20, 3);
    }

    private void test(final int input, final int expected) {
        solution.setTarget(expected);
        final int result = this.solution.guessNumber(input);
        Assert.assertEquals(result, expected);
    }
}