package net.lliira.leetcode.r401;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P412FizzBuzzTest {
    private final P412FizzBuzz solution = new P412FizzBuzz();

    @Test
    public void tests() {
        test(15, Arrays.asList("1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"));
    }

    private void test(final int input, final List<String> expected) {
        final List<String> result = this.solution.fizzBuzz(input);
        Assert.assertEquals(result, expected);
    }
}