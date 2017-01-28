package net.lliira.leetcode.r301;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jerric on 1/28/2017.
 */
public class P345RevertVowels {
    private static final Set<Character> VOWELS = new HashSet<>(Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'));
    public String reverseVowels(String s) {
        if (s == null || s.length() < 2) return s;
        final char[] array = s.toCharArray();
        int left = 0, right = array.length - 1;
        while (true) {
            while (left < right && !VOWELS.contains(array[left])) left++;
            while (left < right && !VOWELS.contains(array[right])) right--;
            if (left >= right) break;
            final char c = array[left];
            array[left++] = array[right];
            array[right--] = c;
        }
        return new String(array);
    }
}
