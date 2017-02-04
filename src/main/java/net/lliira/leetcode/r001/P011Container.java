package net.lliira.leetcode.r001;

/**
 Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines
 are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis
 forms a container, such that the container contains the most water.

 Note: You may not slant the container and n is at least 2.
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
