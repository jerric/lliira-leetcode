package net.lliira.leetcode.r251;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Jerric on 1/27/2017.
 */
public class P290WordPattern {
    public boolean wordPattern(String pattern, String str) {
        if (str == null || str.isEmpty()) return false;
        final String[] words = str.split("\\s+");
        if (words.length != pattern.length()) return false;
        final Map<Character, String> cwMap = new HashMap<>(pattern.length());
        final Set<String> occured = new HashSet<>(pattern.length());
        for (int i = 0; i < pattern.length(); i++) {
            final char c = pattern.charAt(i);
            final String word = words[i];
            final String previous = cwMap.get(c);
            if (previous == null) {
                if (!occured.add(word)) return false;
                cwMap.put(c, word);
            }
            else if (!word.equals(previous)) return false;
        }
        return true;
    }
}
