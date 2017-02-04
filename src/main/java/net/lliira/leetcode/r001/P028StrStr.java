package net.lliira.leetcode.r001;

/**
 Implement strStr().

 Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class P028StrStr {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) return 0;
        if (haystack.isEmpty()) return -1;

        int m = 0, i = 0;
        final int[] table = createTable(needle);
        while (m + i < haystack.length()) {
            if (needle.charAt(i) == haystack.charAt(m + i)) {
                if (i == needle.length() - 1) return m;
                i++;
            } else if (table[i] > -1) {
                m += i - table[i];
                i = table[i];
            } else {
                m++;
                i = 0;
            }
        }
        return -1;
    }

    private int[] createTable(final String needle) {
        final int[] table = new int[needle.length()];
        table[0] = -1;
        if (table.length == 1) return table;
        table[1] = 0;
        int pos = 2, cnd = 0;
        while (pos < needle.length()) {
            // substring continues
            if (needle.charAt(pos - 1) == needle.charAt(cnd)) {
                table[pos++] = ++cnd;
            } else if (cnd > 0) {   // doesn't continue, but can fall back
                cnd = table[cnd];
            } else {    // ran out of candidates
                table[pos++] = 0;
            }
        }
        return table;
    }
}
