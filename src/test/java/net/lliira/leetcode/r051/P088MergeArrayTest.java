package net.lliira.leetcode.r051;

import net.lliira.leetcode.TestHelper;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/23/2017.
 */
public class P088MergeArrayTest {
    private final P088MergeArray solution = new P088MergeArray();

    @Test
    public void tests() {
        test(new int[]{0}, 0, new int[]{1}, 1, new int[]{1});
        test(new int[]{1, 3, 5, 0, 0}, 3, new int[]{2, 4}, 2, new int[]{1, 2, 3, 4, 5});
        test(new int[]{3, 4, 5, 0, 0}, 3, new int[]{1, 2}, 2, new int[]{1, 2, 3, 4, 5});
    }

    private void test(final int[] nums1, final int m, final int[] nums2, final int n, final int[] expected) {
        this.solution.merge(nums1, m, nums2, n);
        TestHelper.assertEquals(nums1, expected);
    }
}
