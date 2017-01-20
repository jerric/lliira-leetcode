package net.lliira.leetcode;

import org.testng.annotations.Test;
import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/19/2017.
 */
public class P025ReverseKGroupTest {
    private final P025ReverseKGroup solution = new P025ReverseKGroup();

    @Test
    public void tests() {
        test(link(1, 2, 3, 4, 5), 2, link(2, 1, 4, 3, 5));
        test(link(1, 2, 3, 4, 5), 3, link(3, 2, 1, 5, 4));
    }

    private void test(final ListNode list, final int k, final ListNode expected) {
        final ListNode result = this.solution.reverseKGroup(list, k);

    }
}
