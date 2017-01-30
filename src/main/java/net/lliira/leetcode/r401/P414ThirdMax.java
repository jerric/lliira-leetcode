package net.lliira.leetcode.r401;

/**
 * Created by Jerric on 1/29/2017.
 */
public class P414ThirdMax {
    public int thirdMax(int[] nums) {
        int second = 0, third = 0;
        for (int i = 1; i < nums.length; i++) {
            final int n = nums[i];
            if (n == nums[0] || n == nums[second] || n == nums[third]) continue;
            if (n > nums[0]) {
                if (second == 1) {
                    if (third == 0) third = 2;
                    nums[2] = nums[1];
                } else if (second == 0) second = 1;
                nums[1] = nums[0];
                nums[0] = n;
            } else if (second == 0 || n > nums[1]) {
                if (second == 1) {
                    if (third == 0) third = 2;
                    nums[2] = nums[1];
                } else second = 1;
                nums[1] = n;
            } else if (third == 0 || n > nums[2]) {
                if (third == 0) third = 2;
                nums[2] = n;
            }
        }
        return nums[third];
    }
}
