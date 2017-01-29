package net.lliira.leetcode.r351;

/**
 * Created by Jerric on 1/28/2017.
 */
public class P367ValidSquare {
    public boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        if (num < 2) return true;
        int left = 2, right = num / 2;
        while (left <= right) {
            final int mid = (left + right) / 2;
            long sq = (long)mid * mid;
            if (sq == num) return true;
            else if (sq < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
