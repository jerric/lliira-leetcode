package net.lliira.leetcode.r351;

/**
 * Created by Jerric on 1/28/2017.
 */
public class P374GuessNumber {

    private int target;

    public void setTarget(final int target) {
        this.target = target;
    }

    int guess(int num) {
        return (target < num) ? -1 : (target > num) ? 1 : 0;
    }

    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= right) {
            final int mid = left + (right - left) / 2;
            final int result = guess(mid);
            if (result == -1) right = mid - 1;
            else if (result == 1) left = mid + 1;
            else return mid;
        }
        return 0;
    }

}
