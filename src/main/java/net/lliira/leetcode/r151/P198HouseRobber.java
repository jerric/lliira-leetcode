package net.lliira.leetcode.r151;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P198HouseRobber {
    public int rob(int[] nums) {
        int p1 = 0, p2 = 0, p3 = 0;
        for (int i = 0; i < nums.length; i++) {
            final int v = Math.max(p2, p3) + nums[i];
            p3 = p2; p2 = p1; p1 = v;
        }
        return Math.max(p1, p2);
    }
}
