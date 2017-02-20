package net.lliira.leetcode.r501;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 Given scores of N athletes, find their relative ranks and the people with the top three highest
 scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

 Example 1:
 Input: [5, 4, 3, 2, 1]
 Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal",
 "Silver Medal" and "Bronze Medal".
 For the left two athletes, you just need to output their relative ranks according to their scores.
 Note:
 N is a positive integer and won't exceed 10,000.
 All the scores of athletes are guaranteed to be unique.
 */
public class P506RelativeRank {
    public String[] findRelativeRanks(int[] nums) {

        final int[] sorted = new int[nums.length];
        System.arraycopy(nums, 0, sorted, 0, nums.length);
        Arrays.sort(sorted);

        final Map<Integer, Integer> indices = new HashMap<>(sorted.length);
        for (int i = 0; i < sorted.length; i++) {
            indices.put(sorted[i], sorted.length - i);
        }

        final String[] results = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            final int index = indices.get(nums[i]);
            if (index == 1) results[i] = "Gold Medal";
            else if (index == 2) results[i] = "Silver Medal";
            else if (index == 3) results[i] = "Bronze Medal";
            else results[i] = Integer.toString(index);
        }
        return results;
    }
}
