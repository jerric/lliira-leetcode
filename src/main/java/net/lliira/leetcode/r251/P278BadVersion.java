package net.lliira.leetcode.r251;

/**
 * Created by Jerric on 1/27/2017.
 */
public class P278BadVersion {

    private int badVersion;
    public void setBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    public boolean isBadVersion(int version) {
        return (version >= badVersion);
    }

    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            final int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
