package net.lliira.leetcode.r101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jerric on 1/24/2017.
 */
public class P119PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        final List<Integer> row = new ArrayList<>(rowIndex);
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            row.add(1);
            int prev = 1;
            for (int j = 1;j < i; j++) {
                prev = row.set(j, prev + row.get(j));
            }
        }
        return row;
    }
}
