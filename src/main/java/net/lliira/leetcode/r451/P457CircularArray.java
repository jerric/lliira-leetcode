package net.lliira.leetcode.r451;

/**
 * Created by Jerric on 2/2/2017.
 */
public class P457CircularArray {
    public boolean circularArrayLoop(int[] nums) {
        final int len = nums.length;
        if (len < 2) return false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            int slow = i, fast = normalize(nums[i], len);
            while (slow != fast & nums[fast] != 0) {
                slow = normalize(slow + nums[slow], len);
                fast = normalize(fast + nums[fast], len);
                if(nums[fast] == 0) break;
                fast = normalize(fast + nums[fast], len);
            }
            if (nums[fast] == 0) continue;
            final int sign = nums[slow];
            fast = normalize(slow + nums[slow], len);
            if (slow == fast) continue;
            boolean good = true;
            while (slow != fast && nums[fast] != 0) {
                final int step = nums[fast];
                if ((sign < 0 && step > 0) || (sign > 0 && step < 0)) good = false;
                nums[fast] = 0;
                fast = normalize(fast + step, len);
            }
            if (slow == fast && good) return true;
        }
        return false;
    }

    private int normalize(int index, final int length) {
        index %= length;
        if (index < 0) index += length;
        return index;
    }
}
