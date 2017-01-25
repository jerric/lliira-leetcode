package net.lliira.leetcode.r101;

import org.testng.annotations.Test;

import java.util.List;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/24/2017.
 */
public class P118PascalTriangleTest {
    private final P118PascalTriangle s = new P118PascalTriangle();

    @Test
    public void t() {
        t(5, list(list(1), list(1, 1), list(1, 2, 1), list(1, 3, 3, 1), list(1, 4, 6, 4, 1)));
    }

    private void t(final int n, final List<List<Integer>> e) {
        final List<List<Integer>> r = this.s.generate(n);
        assertEquals(r, e);
    }
}
