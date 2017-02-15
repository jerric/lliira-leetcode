package net.lliira.leetcode.r001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 Given a collection of distinct numbers, return all possible permutations.

 For example,
 [1,2,3] have the following permutations:
 [
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]
 ]
 */
public class P046Permutation {
    public List<List<Integer>> permute(int[] nums) {
        final List<List<Integer>> results = new LinkedList<>();
        scan(nums, results, new boolean[nums.length], new ArrayList<>(nums.length));
        return results;
    }

    private void scan(final int[] nums, final List<List<Integer>> result,
            final boolean[] flag, final List<Integer> currentList) {
        if (currentList.size() == nums.length) result.add(new ArrayList<>(currentList));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (flag[i]) continue;
                flag[i] = true;
                final int n = nums[i];
                currentList.add(n);
                scan(nums, result, flag, currentList);
                currentList.remove(currentList.size() - 1);
                flag[i] = false;
            }
        }
    }

    public List<List<Integer>> permuteEx(int[] nums) {
        final List<List<Integer>> result = new LinkedList<>();
        final ArrayList<Integer> current = new ArrayList<>(nums.length);
        Arrays.sort(nums);
        for (final int n : nums) current.add(n);
        result.add(new ArrayList<>(current));
        while (nextPermute(current)) result.add(new ArrayList<>(current));
        return result;
    }

    private boolean nextPermute(List<Integer> nums) {
        int end = nums.size() - 1;
        int index = end;
        while (index > 0 && nums.get(index - 1) >= nums.get(index)) index--;
        if (index == 0) return false;

        final int target = nums.get(index - 1);
        int pos = end;
        while (pos > index && nums.get(pos) <= target) pos--;
        swap(nums, index - 1, pos);

        while (index < end) swap(nums, index++, end--);
        return true;
    }

    private void swap(final List<Integer> nums, final int a, final int b) {
        final int val = nums.get(a);
        nums.set(a, nums.get(b));
        nums.set(b, val);
    }

}
