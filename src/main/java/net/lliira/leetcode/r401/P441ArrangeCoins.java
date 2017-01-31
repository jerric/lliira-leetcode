package net.lliira.leetcode.r401;

/**
 * Created by jerricg on 1/30/17.
 */
public class P441ArrangeCoins {

    public int arrangeCoins(int n) {
        if (n < 2) return n;
        int k = (int)Math.sqrt(n);
        while ((k + 1) * k / 2 <= n) {
            k++;
        }
        return k - 1;
    }
}
