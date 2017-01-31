package net.lliira.leetcode.r451;

/**
 * Created by Jerric on 1/31/2017.
 */
public class P461HammingDistance {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while (xor != 0) {
            if ((xor & 0x80000000) != 0) count++;
            xor <<= 1;
        }
        return count;
    }
}
