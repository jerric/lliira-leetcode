package net.lliira.leetcode.r001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 Given an array of strings, group anagrams together.

 For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 Return:

 [
 ["ate", "eat","tea"],
 ["nat","tan"],
 ["bat"]
 ]
 */
public class P049GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        final Map<String, List<String>> map = new HashMap<>(strs.length);
        final List<List<String>> result = new LinkedList<>();
        for (final String str : strs) {
            final char[] array = str.toCharArray();
            Arrays.sort(array);
            final String key = new String(array);
            List<String> list = map.get(key);
            if (list == null) {
                list = new LinkedList<>();
                map.put(key, list);
                result.add(list);
            }
            list.add(str);
        }
        return result;
    }
}
