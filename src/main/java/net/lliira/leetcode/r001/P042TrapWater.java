package net.lliira.leetcode.r001;

/**
 Given n non-negative integers representing an elevation map where the width of each bar is 1,
 compute how much water it is able to trap after raining.

 For example,
 Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.


 The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units
 of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!

 */
public class P042TrapWater {
    public int trap(int[] height) {
        if (height.length < 3) return 0;
        int left = 0, right = height.length - 1;
        int lheight = height[left], rheight = height[right];
        int sum = 0;
        while (left < right) {
            if (lheight <= rheight) {
                final int h = height[++left];
                if (h < lheight) sum += (lheight - h);
                else if (h > lheight) lheight = h;
            } else {
                final int h = height[--right];
                if (h < rheight) sum += (rheight - h);
                else if (h > rheight) rheight = h;
            }
        }
        return sum;
    }
}
