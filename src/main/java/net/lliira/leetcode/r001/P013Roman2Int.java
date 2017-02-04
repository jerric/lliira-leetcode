package net.lliira.leetcode.r001;

import java.util.HashMap;
import java.util.Map;

/**
 Given a roman numeral, convert it to an integer.

 Input is guaranteed to be within the range from 1 to 3999.
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
        int sum = 0, pv = 0;
        for(int i = 0; i < s.length(); i++) {
            final int v = map.get(s.charAt(i));
            if (v > pv) sum -= 2 * pv;
            sum += (pv = v);
        }
        return sum;
    }
}
