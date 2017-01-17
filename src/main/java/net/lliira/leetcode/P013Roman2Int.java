package net.lliira.leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jerric on 1/16/2017.
 */
public class P013Roman2Int {

    private static final char[] letters = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    private static final int[] values = {1, 5, 10, 50, 100, 500, 1000};
    private static final Map<Character, Integer> map = new HashMap<>(letters.length);
    static {
        for (int i = 0; i < letters.length; i++) {
            map.put(letters[i], values[i]);
        }
    }

    public int romanToInt(String s) {
        s = s.toUpperCase();
        int sum = 0, pv = 0;
        for(int i = 0; i < s.length(); i++) {
            final int v = map.get(s.charAt(i));
            if (v > pv) sum -= 2 * pv;
            sum += (pv = v);
        }
        return sum;
    }
}
