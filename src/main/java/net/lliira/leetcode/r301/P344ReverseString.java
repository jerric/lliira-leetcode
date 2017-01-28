package net.lliira.leetcode.r301;

/**
 * Created by Jerric on 1/28/2017.
 */
public class P344ReverseString {
    public String reverseString(String s) {
        if (s == null || s.length() < 2) return s;
        final char[] array = s.toCharArray();
        int left = 0, right = array.length - 1;
        while (left < right) {
            final char c = array[left];
            array[left++] = array[right];
            array[right--] = c;
        }
        return new String(array);
    }
}
