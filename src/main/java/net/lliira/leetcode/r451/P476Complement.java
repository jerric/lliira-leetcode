package net.lliira.leetcode.r451;

/**
 * Created by Jerric on 1/31/2017.
 */
public class P476Complement {
    public int findComplement(int num) {
        return  ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }
}
