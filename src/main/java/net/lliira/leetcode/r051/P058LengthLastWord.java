package net.lliira.leetcode.r051;

/**
 * Created by Jerric on 1/22/2017.
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
