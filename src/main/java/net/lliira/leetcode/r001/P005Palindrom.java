package net.lliira.leetcode.r001;

/**
 Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

 Example:
 Input: "babad"
 Output: "bab"

 Note: "aba" is also a valid answer.
 Example:
 Input: "cbbd"
 Output: "bb"
 */
public class P005Palindrom {
    public String longestPalindrome(String s) {
        final int[] max = new int[]{ 0, s.isEmpty() ? 0 : 1 };
        for (int i = 1; i < s.length(); i++) {
            expand(s, i - 1, i + 1, max);   // find odd palindrom
            expand(s, i - 1, i, max);   // find even palindrom
        }
        return s.substring(max[0], max[0] + max[1]);
    }

    private void expand(final String s, int j, int k, int[] max) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        int len = k - j - 1;
        if (max[1] < len) {
            max[0] = j + 1;
            max[1] = len;
        }
    }

}
