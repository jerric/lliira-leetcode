package net.lliira.leetcode.r401;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jerric on 1/29/2017.
 */
public class P412FizzBuzz {
    public List<String> fizzBuzz(int n) {
        final List<String> result = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) result.add("FizzBuzz");
            else if (i % 5 == 0) result.add("Buzz");
            else if (i % 3 == 0) result.add("Fizz");
            else result.add(Integer.toString(i));
        }
        return result;
    }
}
