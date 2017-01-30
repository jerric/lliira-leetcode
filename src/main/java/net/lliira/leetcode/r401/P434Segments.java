package net.lliira.leetcode.r401;

/**
 * Created by Jerric on 1/30/2017.
 */
public class P434Segments {
    public int countSegments(String s) {
        if (s == null) return 0;
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < s.length(); i++) {
            final boolean space = (s.charAt(i) == ' ');
            if (space && inWord) inWord = false;
            else if (!space && ! inWord) {
                count++;
                inWord = true;
            }
        }
        return count;
    }
}
