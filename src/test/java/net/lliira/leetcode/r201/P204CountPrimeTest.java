package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P204CountPrimeTest {
    private final P204CountPrime solution = new P204CountPrime();

    @Test
    public void tests() {
        test(10, 4);
        test(20, 8);
    }

    private void test(final int a, final int expected) {
        final int result = this.solution.countPrimes(a);
        Assert.assertEquals(result, expected);
    }
}