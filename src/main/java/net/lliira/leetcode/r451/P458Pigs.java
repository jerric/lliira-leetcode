package net.lliira.leetcode.r451;

/**
 * Created by Jerric on 2/2/2017.
 */
public class P458Pigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if (buckets < 2) return 0;
        final int perPig = minutesToTest / minutesToDie + 1;
        int count = 1;
        int total = perPig;
        while (total < buckets) {
            count++;
            total *= perPig;
        }
        return count;
    }
}
