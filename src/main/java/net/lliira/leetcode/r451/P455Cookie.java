package net.lliira.leetcode.r451;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jerric on 1/30/2017.
 */
public class P455Cookie {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gidx = 0, sidx = 0;
        int count = 0;
        while (gidx < g.length && sidx < s.length) {
            if (g[gidx] <= s[sidx++]) {
                count++;
                gidx++;
            }
        }
        return count;
    }
}
