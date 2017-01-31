package net.lliira.leetcode.r401;

/**
 * Created by jerricg on 1/30/17.
 */
public class P441ArrangeCoins {

    public int arrangeCoins(int n) {
        return ((int)Math.sqrt(1 + 8L * n) - 1) / 2;
    }
}
