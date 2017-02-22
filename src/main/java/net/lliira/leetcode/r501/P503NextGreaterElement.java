package net.lliira.leetcode.r501;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 Given a circular array (the next element of the last element is the first element of the array),
 print the Next Greater Number for every element. The Next Greater Number of a number x is the
 first greater number to its traversing-order next in the array, which means you could search
 circularly to find its next greater number. If it doesn't exist, output -1 for this number.

 Example 1:
 Input: [1,2,1]
 Output: [2,-1,2]
 Explanation: The first 1's next greater number is 2;
 The number 2 can't find next greater number;
 The second 1's next greater number needs to search circularly, which is also 2.
 Note: The length of given array won't exceed 10000.

 */


public class P503NextGreaterElement {
    public int[] nextGreaterElements(int[] nums) {
        if (nums.length == 0) return nums;
        final int[] output = new int[nums.length];
        final Deque<Integer> queue = new ArrayDeque<>();
        final Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            final int n = nums[i];
            while (!stack.isEmpty() && stack.peek() <= n) stack.pop();
            if (!stack.isEmpty()) output[i] = stack.peek();
            else queue.add(i);
            stack.push(n);
        }
        while (!queue.isEmpty()) {
            final int i = queue.peek();
            if (stack.size() == 1 || nums[i] < stack.peek()) {
                output[i] = (stack.size() == 1 && nums[i] == stack.peek()) ? -1 : stack.peek();
                queue.poll();
            } else stack.pop();
        }
        return output;
    }
}
