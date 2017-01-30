package net.lliira.leetcode.r401;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Jerric on 1/30/2017.
 */
public class P438AllAnagram {
    public List<Integer> findAnagrams(String s, String p) {
        final List<Integer> locs = new LinkedList<>();
        if (p == null || p.isEmpty() || s.length() < p.length()) return  locs;
        final int[] pattern = new int[256];
        final char[] ;
        for (int i = 0; i < p.length(); i++) {
            final char c = p.charAt(i);
            pattern[c] += 1;
            if (pattern[c] == 1) cp++;
        }
        final char[] pchars = new char[cp];
        for ()

        final int[] count = new int[256];
        for (int i = 0; i <= s.length(); i++) {
            final char c = s.charAt(i);
            count[c] += 1;
            if (i - p.length() >= 0) count[s.charAt(i - p.length())] -= 1;
            if (count[c] != pattern[c]) continue;
        }
    }
}
