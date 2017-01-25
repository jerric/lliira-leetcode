package net.lliira.leetcode.r101;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P125PalindromTest {
    private final P125Palindrom s = new P125Palindrom();

    @Test
    public void t() {
        t("A man, a plan, a canal: Panama", true);
        t("race a car", false);
    }

    private void t(final String str, final boolean e) {
        final boolean r = this.s.isPalindrome(str);
        Assert.assertEquals(r, e);
    }
}
