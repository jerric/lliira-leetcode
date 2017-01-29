package net.lliira.leetcode.r351;

/**
 * Created by Jerric on 1/28/2017.
 */
public class P383RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        final int[] count = new int[256];
        for (int i = 0; i < ransomNote.length(); i++) count[ransomNote.charAt(i)] += 1;
        for (int i = 0; i < magazine.length(); i++) count[magazine.charAt(i)] -= 1;
        for (int c : count) if (c > 0) return false;
        return true;
    }
}
