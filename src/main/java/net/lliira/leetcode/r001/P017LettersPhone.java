package net.lliira.leetcode.r001;

import java.util.*;

/**
 Given a digit string, return all possible letter combinations that the number could represent.

 A mapping of digit to letters (just like on the telephone buttons) is given below.

 Input:Digit string "23"
 Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

 Note:
 Although the above answer is in lexicographical order, your answer could be in any order you want.
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
