package net.lliira.leetcode.r301;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Jerric on 1/28/2017.
 */
public class P349ArrayIntersect {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) return new int[0];
        if (nums1.length > nums2.length) {
            final int[] t = nums1;
            nums1 = nums2;
            nums2 = t;
        }
        final Set<Integer> set = new HashSet<>(nums1.length);
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        final Set<Integer> list = new HashSet<>(set.size());
        for (int i = 0; i < nums2.length; i++) {
            final int n = nums2[i];
            if (set.contains(n)) list.add(n);
        }
        final int[] array = new int[list.size()];
        int i = 0;
        for (int n : list) array[i++] = n;
        return array;
    }
}
