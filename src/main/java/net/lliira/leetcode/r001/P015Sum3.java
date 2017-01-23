package net.lliira.leetcode.r001;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jerric on 1/16/2017.
 */
public class P015Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        final List<List<Integer>> results = new LinkedList<>();
        int i = nums.length - 1;
        while(i >= 2) {
            final int n = nums[i];
            int left = 0, right = i - 1;
            int nl = nums[left], nr = nums[right];
            while (left < right) {
                final int sum = nl + nr;
                if (sum <= -n) {
                    if (sum == -n) results.add(Arrays.asList(nl, nr, n));
                    while (left < right && nums[left] == nl) left++;
                    nl = nums[left];
                } else {
                    while (left < right && nums[right] == nr) right--;
                    nr = nums[right];
                }
            }
            while (i >= 2 && nums[i] == n) i--;
        }
        return results;
    }
}
