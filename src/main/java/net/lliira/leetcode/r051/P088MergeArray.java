package net.lliira.leetcode.r051;

/**
 * Created by Jerric on 1/23/2017.
 */
public class P088MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = m + n - 1, idxm = m - 1, idxn = n - 1;
        while (idxm >= 0 && idxn >= 0) {
            nums1[idx--] = (nums1[idxm] >= nums2[idxn]) ? nums1[idxm--] : nums2[idxn--];
        }
        if (idxn>= 0) System.arraycopy(nums2, 0, nums1, 0, idxn + 1);
    }
}
