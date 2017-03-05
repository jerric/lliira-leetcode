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
public class P057InsertIntervalTest {
    private final P057InsertInterval solution = new P057InsertInterval();

    @Test
    public void tests() {
        test(list(itv(1,5)), itv(2, 3), list(itv(1,5)));
        test(list(itv(1,3),itv(6, 9)), itv(4, 5), list(itv(1,3), itv(4,5), itv(6, 9)));
        test(list(itv(1,3),itv(6, 9)), itv(2, 5), list(itv(1,5), itv(6, 9)));
        test(list(itv(1,3),itv(6, 9)), itv(2, 5), list(itv(1,5), itv(6, 9)));
        test(list(itv(1,2),itv(3,5),itv(6,7),itv(8,10),itv(12,16)), itv(4,9), list(itv(1,2),itv(3,10),itv(12,16)));
    }

    private void test(final List<Interval> input, final Interval interval, final List<Interval> expected) {
        final List<Interval> result = this.solution.insert(input, interval);
        Assert.assertEquals(result, expected);
    }
}