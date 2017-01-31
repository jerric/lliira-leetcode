package net.lliira.leetcode.r451;

import java.util.Arrays;

/**
 * Created by Jerric on 1/31/2017.
 */
public class P475Heater {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int radius = 0;
        int j = 0;
        for (final int h : houses) {
            while (j < heaters.length && heaters[j] <= h) j++;
            final int left = (j > 0) ? h - heaters[j - 1] : Integer.MAX_VALUE;
            final int right = (j < heaters.length) ? heaters[j] - h : Integer.MAX_VALUE;
            radius = Math.max(radius, Math.min(left, right));
        }
        return radius;
    }
}
