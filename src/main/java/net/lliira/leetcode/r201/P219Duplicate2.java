package net.lliira.leetcode.r201;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jerricg on 1/26/17.
 */
public class P219Duplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length < 2) return false;

        final Map<Integer, Integer> occurred = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            final Integer pos = occurred.put(nums[i], i);
            if (pos != null && i - pos <= k) return true;
        }
        return false;
    }
}
