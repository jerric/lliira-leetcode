package net.lliira.leetcode.r101;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P121Stock {
    public int maxProfit(int[] prices) {
        int max = 0, current = 0;
        for (int i = 1; i < prices.length; i++) {
            current = Math.max (0, current + prices[i] - prices[i - 1]);
            max = Math.max(max, current);
        }
        return max;
    }
}
