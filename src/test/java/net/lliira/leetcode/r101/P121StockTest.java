package net.lliira.leetcode.r101;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P121StockTest {
    private final P121Stock s = new P121Stock();

    @Test
    public void t() {
        t(new int[]{7, 1, 5, 3, 6, 4}, 5);
        t(new int[]{7, 6, 4, 3, 1}, 0);
    }

    private void t(final int[] prices, final int e) {
        final int r = this.s.maxProfit(prices);
        Assert.assertEquals(r, e);
    }
}
