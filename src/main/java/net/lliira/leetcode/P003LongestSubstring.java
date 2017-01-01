package net.lliira.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jerric on 12/29/2016.
 */
public class P003LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        final Map<Character, Integer> locations = new HashMap<>(s.length());
        int maxLength = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            final char ch = s.charAt(i);
            final Integer prevLoc = locations.get(ch);
            if (prevLoc != null && prevLoc >= start) {
                // found a duplicate char, move the search range to be after the last occurrance
                int length = i - start;
                if (maxLength < length) maxLength = length;
                start = prevLoc + 1;
            }
            locations.put(ch, i);
        }
        final int length = s.length() - start;
        if (maxLength < length) maxLength = length;
        return maxLength;
    }
}
