package net.lliira.leetcode.r201;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jerric on 1/27/2017.
 */
public class P242Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        final int[] scounts = new int[26], tcounts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            scounts[s.charAt(i) - 'a']++;
            tcounts[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (scounts[i] != tcounts[i]) return false;
        }
        return true;
    }
}
