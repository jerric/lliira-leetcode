package net.lliira.leetcode.r301;

import java.util.*;

/**
 * Created by Jerric on 1/28/2017.
 */
public class P350ArrayIntersect2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) return new int[0];
        final Map<Integer, Integer> map = new HashMap<>(Math.max(nums1.length, nums2.length));
        for (int i = 0; i < nums1.length; i++) {
            final int n = nums1[i];
            Integer count = map.get(n);
            map.put(n, (count == null) ? 1 : count + 1);
        }
        final List<Integer> list = new ArrayList<>(map.size());
        for (int i = 0; i < nums2.length; i++) {
            final int n = nums2[i];
            Integer count = map.get(n);
            if (count == null || count < 1) continue;
            list.add(n);
            map.put(n, count - 1);
        }
        final int[] array = new int[list.size()];
        int i = 0;
        for (int n : list) array[i++] = n;
        return array;
    }
}
