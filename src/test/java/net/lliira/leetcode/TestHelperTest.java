package net.lliira.leetcode;

import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/30/2017.
 */
public class TestHelperTest {

    @Test
    public void testConstructTreeFromArray() {
        final TreeNode root = tree(1, 2, 3, null, 4);
        TestHelper.assertEquals(root, tree(1, tree(2, null, 4), tree(3)));
    }
}
