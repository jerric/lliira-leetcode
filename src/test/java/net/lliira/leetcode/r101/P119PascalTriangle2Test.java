package net.lliira.leetcode.r101;

import org.testng.annotations.Test;

import java.util.List;

import static net.lliira.leetcode.TestHelper.assertEquals;
import static net.lliira.leetcode.TestHelper.list;

/**
 * Created by Jerric on 1/24/2017.
 */
public class P119PascalTriangle2Test {
    private final P119PascalTriangle2 s = new P119PascalTriangle2();

    @Test
    public void t() {
        t(3, list(1, 3, 3, 1));
    }

    private void t(final int n, final List<Integer> e) {
        final List<Integer> r = this.s.getRow(n);
        assertEquals(r, e);
    }
}
