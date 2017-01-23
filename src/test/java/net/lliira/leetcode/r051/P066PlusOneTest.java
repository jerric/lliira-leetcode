package net.lliira.leetcode.r051;

import net.lliira.leetcode.TestHelper;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/23/2017.
 */
public class P066PlusOneTest {
    private final P066PlusOne solution = new P066PlusOne();

    @Test
    public void tests() {
        test(new int[]{9}, new int[]{1, 0});
        test(new int[]{1,9}, new int[]{2, 0});
    }

    private void test(final int[] digits, final int[] expected) {
        final int[] result = this.solution.plusOne(digits);
        TestHelper.assertEquals(result, expected);
    }
}
