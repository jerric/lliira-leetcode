package net.lliira.leetcode.r051;

/**
 Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the
 length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 For example,
 Given s = "Hello World",
 return 5.
 */
public class P058LengthLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) return 0;
        int start = s.length() - 1;
        while (start >= 0 && s.charAt(start) == ' ') start--;
        if (start < 0) return 0;

        for (int i = start - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ')  return (start - i );
        }
        return start + 1;
    }
}
