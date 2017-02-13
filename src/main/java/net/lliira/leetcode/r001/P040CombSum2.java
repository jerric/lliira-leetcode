package net.lliira.leetcode.r001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 Given a collection of candidate numbers (C) and a target number (T), find all unique combinations
 in C where the candidate numbers sums to T.

 Each number in C may only be used once in the combination.

 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
 A solution set is:
 [
 [1, 7],
 [1, 2, 5],
 [2, 6],
 [1, 1, 6]
 ]
 */
public class P040CombSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        final List<List<Integer>> results = new LinkedList<>();
        final List<Integer> current = new ArrayList<>();
        search(candidates, results, current, target, 0);
        return results;
    }

    private void search(final int[] candidates, final List<List<Integer>> results,
            final List<Integer> current, final int remain, final int index) {
        if (remain == 0) results.add(new ArrayList<>(current));
        else {
            int i = index;
            while (i < candidates.length) {
                while (i > index && i < candidates.length && candidates[i - 1] == candidates[i]) i++;
                if (i == candidates.length) break;
                final int val = candidates[i];
                final int rem = remain - val;
                if (rem < 0) break;
                current.add(val);
                search(candidates, results, current, rem, ++i);
                current.remove(current.size() - 1);
            }
        }
    }
}
