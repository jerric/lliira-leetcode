package net.lliira.leetcode.r251;

/**
 * Created by Jerric on 1/27/2017.
 */
public class P258AddDigits {
    public int addDigits(int num) {
        while (num >= 10) {
            int s = 0;
            while (num > 0) {
                s += (num % 10);
                num /= 10;
            }
            num = s;
        }
        return num;
    }
}
