package net.lliira.leetcode.r401;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jerric on 1/30/2017.
 */
public class P447Boomerang {
    public int numberOfBoomerangs(int[][] points) {
        final int size = points.length;
        Map<Integer, Integer> map = new HashMap<>(size);
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) continue;
                final int dx = points[i][0] - points[j][0], dy = points[i][1] - points[j][1];
                final int d = dx * dx + dy * dy;
                map.put(d, map.getOrDefault(d, 0) + 1);
            }
            for (final int val : map.values()) {
                count += val * (val - 1);
            }
            map.clear();
        }
        return count;
    }
}
