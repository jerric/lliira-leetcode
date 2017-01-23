package net.lliira.leetcode.r051;

import net.lliira.leetcode.ListNode;
import org.testng.annotations.Test;
import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/23/2017.
 */
public class P083RemoveDupsTest {
    private final P083RemoveDups solution = new P083RemoveDups();

    @Test
    public void tests() {
        test(link(1, 1, 2), link(1, 2));
        test(link(1, 1, 2, 3, 3), link(1, 2, 3));
    }
    private void test(final ListNode head, final ListNode expected) {
        final ListNode result = this.solution.deleteDuplicates(head);
        assertEquals(result, expected);
    }
}
