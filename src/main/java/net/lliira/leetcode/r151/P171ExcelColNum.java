package net.lliira.leetcode.r151;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P171ExcelColNum {
    public int titleToNumber(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            num = num * 26 + (c - 'A') + 1;
        }
        return num;
    }
}
