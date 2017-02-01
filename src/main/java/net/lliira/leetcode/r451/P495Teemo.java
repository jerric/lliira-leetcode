package net.lliira.leetcode.r451;

/**
 * Created by jerricg on 1/31/17.
 */
public class P495Teemo {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) return 0;
        int sum = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            sum += Math.min(timeSeries[i] - timeSeries[i-1], duration);
        }
        return sum + duration;
    }
}
