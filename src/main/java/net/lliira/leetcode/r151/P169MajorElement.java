package net.lliira.leetcode.r151;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P169MajorElement {
    public int majorityElement(int[] nums) {
        int n = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            final int t = nums[i];
            if (t == n) count++;
            else if (count > 1) count--;
            else n = t;
        }
        return n;
    }
}
