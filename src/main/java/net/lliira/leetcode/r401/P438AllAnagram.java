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
        if (p == null || p.isEmpty() || s.length() < p.length()) return locs;
        final int[] patterns = new int[26];
        for (int i = 0; i < p.length(); i++) {
            patterns[p.charAt(i) - 'a']++;
        }

        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (patterns[s.charAt(right++) - 'a']-- >= 1) count--;
            if (count == 0) locs.add(left);
            if (right - left == p.length() && patterns[s.charAt(left++) - 'a']++ >= 0) count++;
        }
        return locs;
    }
}
