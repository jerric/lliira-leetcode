package net.lliira.leetcode.r001;

public class P026RemoveDup {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        int index = 1;
        int val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int v = nums[i];
            if (v > val) {
                nums[index++] = v;
                val = v;
            }
        }
        return index;
    }

}
