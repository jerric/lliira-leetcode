package net.lliira.leetcode.r001;

/**
 * Created by jerricg on 1/19/17.
 */
public class P027RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            final int v = nums[i];
            if (v != val) {
                nums[length++] = v;
            }
        }
        return length;
    }
}
