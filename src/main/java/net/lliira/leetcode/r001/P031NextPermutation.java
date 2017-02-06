package net.lliira.leetcode.r001;

/**
 Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

 If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

 The replacement must be in-place, do not allocate extra memory.

 Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 1,2,3 → 1,3,2
 3,2,1 → 1,2,3
 1,1,5 → 1,5,1
 */
public class P031NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums.length < 2) return;
        int end = nums.length - 1;
        int index = end;
        while (index > 0 && nums[index - 1] >= nums[index]) index--;
        if (index > 0) {
            final int target = nums[index - 1];
            int pos = end;
            while (pos > index && nums[pos] <= target) pos--;
            swap(nums, index - 1, pos);
        }
        while (index < end) swap(nums, index++, end--);
    }

    private void swap(final int nums[], final int a, final int b) {
        final int val = nums[a];
        nums[a] = nums[b];
        nums[b] = val;
    }
}
