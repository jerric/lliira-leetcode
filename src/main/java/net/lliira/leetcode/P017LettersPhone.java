package net.lliira.leetcode;

import java.util.*;

/**
 * Created by Jerric on 1/16/2017.
 */
public class P017LettersPhone {
    private static final String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>(1);
        if (digits.isEmpty()) return result;
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            final String letters = map[digits.charAt(i) - '0'];
            final List<String> temp = new ArrayList<>(result.size() * letters.length());
            for (int j = 0; j < letters.length(); j++) {
                final char c = letters.charAt(j);
                for (final String str : result) {
                    temp.add(str + c);
                }
            }
            result = temp;
        }
        return result;
    }
}
