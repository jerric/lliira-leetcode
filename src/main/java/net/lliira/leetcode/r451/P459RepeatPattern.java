package net.lliira.leetcode.r451;

/**
 * Created by Jerric on 1/30/2017.
 */
public class P459RepeatPattern {
    public boolean repeatedSubstringPattern(String str) {
        if (str.length() < 2) return false;
        int l = str.length();
        for(int i= l/2 ;i>=1 ;i--) {
            if (str.length() % i != 0) continue;
            final String substr = str.substring(0, i);
            boolean repeat = true;
            for (int t = i; t < str.length(); t += i) {
                if(!str.substring(t, t + i).equals(substr)) {
                    repeat = false;
                    break;
                }
            }
            if (repeat) return true;
        }
        return false;
    }
}
