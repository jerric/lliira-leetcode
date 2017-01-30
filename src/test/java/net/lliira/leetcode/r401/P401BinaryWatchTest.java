package net.lliira.leetcode.r401;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P401BinaryWatchTest {
    private final P401BinaryWatch solution = new P401BinaryWatch();

    @Test
    public void tests() {
        test(1, Arrays.asList("1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"));
    }

    private void test(final int input, final List<String> expected) {
        final List<String> result = this.solution.readBinaryWatch(input);
        Collections.sort(expected);
        Collections.sort(result);
        Assert.assertEquals(result, expected);
    }
}