package net.lliira.leetcode.r301;

/**
 * Created by Jerric on 1/27/2017.
 */
public class P303RangeSum {
    public class NumArray {

        private final int[] sums;

        public NumArray(int[] nums) {
            this.sums = new int[nums.length + 1];
            int sum = 0;
            for (int i = 0; i < nums.length; i++) this.sums[i + 1] = (sum += nums[i]);
        }

        public int sumRange(int i, int j) {
            return this.sums[j + 1] - this.sums[i];
        }
    }

    public NumArray create(int[] nums) {
        return new NumArray(nums);
    }
}
