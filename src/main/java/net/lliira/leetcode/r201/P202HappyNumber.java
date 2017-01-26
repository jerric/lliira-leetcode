package net.lliira.leetcode.r201;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jerric on 1/26/2017.
 */
public class P202HappyNumber {
    public boolean isHappy(int n) {
        final Set<Integer> occurred = new HashSet<>();
        while (!occurred.contains(n)) {
            occurred.add(n);
            int sum = 0;
            while (n > 0) {
                final int digit = n % 10;
                sum += (digit * digit);
                n /= 10;
            }
            if (sum == 1) return true;
            n = sum;
        }
        return false;
    }
}
