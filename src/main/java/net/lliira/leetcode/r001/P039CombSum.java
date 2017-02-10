package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

import java.util.*;

/**
 Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

 The same repeated number may be chosen from C unlimited number of times.

 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [2, 3, 6, 7] and target 7,
 A solution set is:
 [
 [7],
 [2, 2, 3]
 ]
 */
public class P039CombSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        final List<List<Integer>> result = new LinkedList<>();
        if (candidates.length == 0 || target < 0) return result;
        Arrays.sort(candidates);
        search(candidates, result, new ArrayList<>(), target, 0);
        return result;
    }

    private void search(final int[] candidates, final List<List<Integer>> result, final List<Integer> current,
                        final int remain, final int start) {
        if (remain == 0) result.add(new ArrayList<>(current));
        else {
            for (int i = start; i < candidates.length; i++) {
                final int val = candidates[i];
                final int newRemain = remain - val;
                if (newRemain < 0) break;
                current.add(val);
                search(candidates, result, current, newRemain, i);
                current.remove(current.size() - 1);
            }
        }
    }
}
