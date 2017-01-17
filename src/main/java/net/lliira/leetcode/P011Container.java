package net.lliira.leetcode;

/**
 * Created by Jerric on 1/14/2017.
 */
public class P011Container {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while (left < right) {
            final int hl = height[left], hr = height[right];
            max = Math.max(max, Math.min(hl, hr) * (right - left ));
            if (hl < hr) left++;
            else right--;
        }
        return max;
    }
}
