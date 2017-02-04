package net.lliira.leetcode.r001;

import java.util.HashMap;
import java.util.Map;

/**
 Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].

 */
public class P001TwoSum {

    public int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            final Integer pos = map.get(target - num);
            if (pos != null) {
                return new int[] { pos, i };
            }
            map.put(num, i);
        }
        return null;
    }
}
