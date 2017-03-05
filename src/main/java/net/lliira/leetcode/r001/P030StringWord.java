package net.lliira.leetcode.r001;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 You are given a string, s, and a list of words, words, that are all of the same length. Find all
 starting indices of substring(s) in s that is a concatenation of each word in words exactly once
 and without any intervening characters.

 For example, given:
 s: "barfoothefoobarman"
 words: ["foo", "bar"]

 You should return the indices: [0,9].
 (order does not matter).
 */
public class P030StringWord {
    public List<Integer> findSubstring(String s, String[] words) {
        final List<Integer> result = new LinkedList<>();
        if (s == null || s.isEmpty() || words == null || words.length == 0) return result;
        final int wlen = words[0].length(), limit = s.length() - wlen;
        if (s.length() < words.length * wlen) return result;

        // create a word->count map
        final Map<String, Integer> baseMap = new HashMap<>(words.length);
        for (final String word : words) baseMap.put(word, baseMap.getOrDefault(word, 0) + 1);

        for (int i = 0; i < wlen; i++) {
            int count = 0, ups = words.length, downs = 0;
            final Map<String, Integer> map = new HashMap<>(baseMap);
            for (int j = i; j <= limit; j += wlen) {
                // when we have reached the max length, remove the previous word from the current window
                if (count == words.length) {
                    count--;
                    final int prevPos = j - (words.length) * wlen;
                    final String prevWord = s.substring(prevPos, prevPos + wlen);
                    if (map.containsKey(prevWord)) {
                        final int c = map.get(prevWord) + 1;
                        map.put(prevWord, c);
                        if (c > 0) ups++;
                        else downs--;
                    }
                }

                // subtract the current word from the sum if it
                final String word = s.substring(j, j + wlen);
                count++;
                // if the word doesn't match anything, do nothing; if the word matches, but the per
                // word count is not 1, either we have more or less words
                if (map.containsKey(word)) {
                    final int c = map.get(word) - 1;
                    map.put(word, c);
                    if (c < 0) downs++;
                    else ups--;

                    if (count == words.length && ups == 0 && downs == 0) result.add(j - (words.length - 1) * wlen);
                }
            }
        }
        return result;
    }
}
