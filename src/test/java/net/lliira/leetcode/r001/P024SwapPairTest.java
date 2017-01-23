package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;
import org.testng.annotations.Test;
import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/19/2017.
 */
public class P024SwapPairTest {
    private final P024SwapPair solution = new P024SwapPair();

    @Test
    public void tests() {
        test(link(1, 2, 3, 4), link(2, 1, 4, 3));
    }

    private void test(final ListNode list, final ListNode expected) {
        final ListNode result = this.solution.swapPairs(list);
        assertEquals(result, expected);
    }
}
