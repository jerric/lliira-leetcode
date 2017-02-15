package net.lliira.leetcode.r051;

import net.lliira.leetcode.Interval;
import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P056MergeIntervalTest {
    private final P056MergeInterval solution = new P056MergeInterval();

    @Test
    public void tests() {
        test(list(itv(1,4),itv(2,3)), list(itv(1,4)));
        test(list(itv(1,3),itv(2,6),itv(8,10),itv(15,18)), list(itv(1,6),itv(8,10),itv(15,18)));
    }

    private void test(final List<Interval> input, final List<Interval> expected) {
        final List<Interval> result = this.solution.merge(input);
        Assert.assertEquals(result, expected);
    }
}