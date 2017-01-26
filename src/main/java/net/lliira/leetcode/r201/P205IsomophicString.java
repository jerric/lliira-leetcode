package net.lliira.leetcode.r201;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jerric on 1/26/2017.
 */
public class P205IsomophicString {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        final int[] ms = new int[256], mt = new int[256];
        for (int i = 0; i < s.length(); i++) {
            final char cs = s.charAt(i), ct = t.charAt(i);
            if (ms[cs] != mt[ct]) return false;
            ms[cs] = mt[ct] = i + 1;
        }
        return true;
    }
}
