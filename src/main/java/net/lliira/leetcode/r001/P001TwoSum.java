package net.lliira.leetcode.r001;

import java.util.HashMap;
import java.util.Map;

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
