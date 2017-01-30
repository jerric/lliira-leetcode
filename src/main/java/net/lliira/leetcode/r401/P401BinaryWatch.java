package net.lliira.leetcode.r401;

import java.util.*;

/**
 * Created by Jerric on 1/29/2017.
 */
public class P401BinaryWatch {
    private static final List<List<Integer>> HOUR_MAP = new ArrayList<>(4);
    private static final List<List<Integer>> MINUTE_MAP = new ArrayList<>(6);
    static {
        for (int i = 0; i < 6; i++) {
            if (i < 4) HOUR_MAP.add(new LinkedList<>());
            MINUTE_MAP.add(new LinkedList<>());
        }
        for (int i = 0;  i < 60; i++) {
            final int digit = digits(i);
            if (i < 12) HOUR_MAP.get(digit).add(i);
            MINUTE_MAP.get(digit).add(i);
        }
    }

    private static int digits(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) count++;
            num >>= 1;
        }
        return count;
    }

    public List<String> readBinaryWatch(int num) {
        if (num == 0) return Collections.singletonList("0:00");
        final List<String> result = new LinkedList<>();
        final int hdMax = Math.min(num, 3), mdMax = Math.min(num, 5);
        for (int hd = 0; hd <= hdMax; hd++) {
            final int md = num - hd;
            if (md > mdMax) continue;
            for (final int h : HOUR_MAP.get(hd)) {
                for (final int m : MINUTE_MAP.get(md)) {
                    final String s = h + ":" + ((m < 10) ? "0" : "") + m;
                    result.add(s);
                }
            }
        }
        return result;
    }
}
