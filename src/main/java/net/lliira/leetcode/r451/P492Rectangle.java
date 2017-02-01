package net.lliira.leetcode.r451;

/**
 * Created by Jerric on 1/31/2017.
 */
public class P492Rectangle {
    public int[] constructRectangle(int area) {
        if (area < 4) return new int[]{area, 1};
        int width = (int)Math.sqrt(area);
        while (area % width != 0) width--;
        return new int[]{area / width, width};
    }
}
