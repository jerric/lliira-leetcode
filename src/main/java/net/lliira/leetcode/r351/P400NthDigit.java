package net.lliira.leetcode.r351;

/**
 * Created by Jerric on 1/29/2017.
 */
public class P400NthDigit {
    public int findNthDigit(int n) {
        int digits = 1;
        long base = 9, total;
        while ((total = base * digits) < n) {
            n -= total;
            base *= 10;
            digits++;
        }
        int index = n % digits;
        if (index == 0) index = digits;
        int num = 1;
        for (int i = 1; i < digits; i++) num *= 10;
        num += (index == digits) ? n / digits - 1 : n /digits;

        for (int i = index; i < digits; i++) num /= 10;
        return (num % 10);
    }
}
