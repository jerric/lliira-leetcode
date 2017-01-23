package net.lliira.leetcode.r051;

/**
 * Created by Jerric on 1/23/2017.
 */
public class P066PlusOne {
    public int[] plusOne(int[] digits) {
        int idx = digits.length - 1, remain = 1;
        while (remain > 0 && idx >= 0) {
            remain += digits[idx];
            digits[idx--] = remain % 10;
            remain /= 10;
        }
        if (remain > 0) {
            final int[] digitsNew = new int[digits.length + 1];
            digitsNew[0] = remain;
            digits = digitsNew;
        }
        return digits;
    }
}
