package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;
import org.testng.annotations.Test;
import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/19/2017.
 */
public class P021MergeListTest {
    private final P021MergeList solution = new P021MergeList();

    @Test
    public void tests() {
        test(link(1, 3, 5), link(2, 4), link(1, 2, 3, 4, 5));
    }

    private void test(final ListNode l1, final ListNode l2, final ListNode expected) {
        final ListNode result = this.solution.mergeTwoLists(l1, l2);
        assertEquals(result, expected);
    }
}
