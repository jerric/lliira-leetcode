package net.lliira.leetcode.r101;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P125Palindrom {
    static final int DIFF = 'a' - 'A';

    public boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        int left = 0, right = s.length() - 1;
        final char[] array = s.toCharArray();

        while (left <= right) {
            char l = ' ', r = ' ';
            while (left<= right && !valid(l = array[left])) left++;
            while (left <= right && !valid(r = array[right])) right--;
            if (left > right) break;
            if (l >= 'A' && l <= 'Z') l += DIFF;
            if (r >= 'A' && r <= 'Z') r += DIFF;
            if (l != r) return false;
            left++;
            right--;
        }
        return true;
    }

    private boolean valid(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
