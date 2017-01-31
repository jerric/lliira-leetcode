package net.lliira.leetcode.r451;

/**
 * Created by Jerric on 1/31/2017.
 */
public class P485MaxConsecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for (final int n : nums) {
            if (n == 1) {
                count++;
                if (max < count) max = count;
            } else count = 0;
        }
        return max;
    }
}
