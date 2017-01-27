package net.lliira.leetcode.r201;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jerricg on 1/26/17.
 */
public class P217Duplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) return false;
        final Set<Integer> occurred = new HashSet<>(nums.length);
        for (final int n : nums) {
            if (!occurred.add(n)) return true;
        }
        return false;
    }
}
