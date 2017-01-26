package net.lliira.leetcode.r151;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P190ReverseBits {
    /** An array of 4-bit reverse map
     * IDX: 0000 0001 0010 0011 0100 0101 0110 0111 1000 1001 1010 1011 1100 1101 1110 1111
     * MAP: 0000 1000 0100 1100 0010 1010 0110 1110 0001 1001 0101 1101 0011 1011 0111 1111
     */
    private static final byte[] MAP = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};

    public int reverseBits(int n) {
        boolean negative = (n < 0);
        if (negative) n &= Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < 8; i++) {
            if (negative && i == 7) n |= 8;
            result = (result << 4) | MAP[n % 16];
            n >>= 4;
        }
        return result;
    }
}
