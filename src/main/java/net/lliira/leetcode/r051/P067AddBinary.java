package net.lliira.leetcode.r051;

/**
 * Created by Jerric on 1/23/2017.
 */
public class P067AddBinary {
    public String addBinary(String a, String b) {
        if (a == null || a.isEmpty()) return b;
        if (b == null || b.isEmpty()) return a;
        if (a.length() < b.length()) {
            final String tmp = a;
            a = b;
            b = tmp;
        }
        final StringBuilder builder = new StringBuilder(a.length() + 1);
        int ib = b.length() - 1;
        int remain = 0;
        for (int ia = a.length() - 1; ia >= 0; ia--) {
            remain += (a.charAt(ia) - '0');
            if (ib >= 0) remain += (b.charAt(ib--) - '0');
            builder.append((remain % 2 == 0) ?  '0' : '1');
            remain /= 2;
        }
        if (remain > 0) builder.append(remain);
        return builder.reverse().toString();
    }
}
