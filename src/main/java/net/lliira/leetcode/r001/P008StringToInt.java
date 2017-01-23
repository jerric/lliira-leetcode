package net.lliira.leetcode.r001;

/**
 * Created by Jerric on 1/1/2017.
 */
public class P008StringToInt {
    public int myAtoi(String str) {
        int i = 0;
        char c = ' ';
        while(i < str.length() && (c = str.charAt(i)) == ' ') i++;

        if (i == str.length()) return 0;

        int sign = 1;
        if (c == '+') i++;
        else if (c == '-') {
            sign = -1;
            i++;
        } else if (c < '0' || c > '9') return 0;

        int v = 0;
        while(i < str.length()){
            c = str.charAt(i++);
            if (c >= '0' && c <= '9') {
               final int d = (c - '0');
                if(Integer.MAX_VALUE/10 < v || Integer.MAX_VALUE/10 == v && Integer.MAX_VALUE %10 < d)
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                v = v * 10 + d;
            } else break;
        }
        return v * sign;
    }

}
