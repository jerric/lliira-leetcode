package net.lliira.leetcode.r101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jerric on 1/24/2017.
 */
public class P118PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        final List<List<Integer>> result = new ArrayList<>(numRows);
        if (numRows >= 1) result.add(Collections.singletonList(1));
        for (int i = 1; i < numRows; i++) {
            final List<Integer> plist = result.get(i - 1);
            final List<Integer> list = new ArrayList<>(numRows);
            int prev = 0;
            for (final int v : plist ) {
                list.add(prev + v);
                prev = v;
            }
            list.add(1);
            result.add(list);
        }
        return result;
    }
}
