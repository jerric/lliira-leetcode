package net.lliira.leetcode.r001;

import java.util.HashMap;
import java.util.Map;

/**
 Given a string, find the length of the longest substring without repeating characters.

 Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a
 subsequence and not a substring.
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
