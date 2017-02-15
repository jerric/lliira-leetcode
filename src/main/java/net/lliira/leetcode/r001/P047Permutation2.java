package net.lliira.leetcode.r001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 Given a collection of numbers that might contain duplicates, return all possible unique permutations.

 For example,
 [1,1,2] have the following unique permutations:
 [
 [1,1,2],
 [1,2,1],
 [2,1,1]
 ]
 */
public class P047Permutation2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        final List<List<Integer>> results = new LinkedList<>();
        scan(nums, results, new boolean[nums.length], new ArrayList<>(nums.length));
        return results;
    }

    private void scan(final int[] nums, final List<List<Integer>> result, final boolean[] flag,
            final List<Integer> currentList) {
        if (currentList.size() == nums.length) result.add(new ArrayList<>(currentList));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (flag[i]) continue;
                final int n = nums[i];
                if (i < nums.length - 1 && nums[i] == nums[i + 1] && flag[i + 1]) continue;
                currentList.add(n);
                flag[i] = true;
                scan(nums, result, flag, currentList);
                flag[i] = false;
                currentList.remove(currentList.size() - 1);
            }
        }
    }
}
