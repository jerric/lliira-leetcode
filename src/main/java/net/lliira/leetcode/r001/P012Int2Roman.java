package net.lliira.leetcode.r001;

/**
 Given an integer, convert it to a roman numeral.

 Input is guaranteed to be within the range from 1 to 3999.
 */
public class P012Int2Roman {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<values.length;i++) {
            final int v = values[i];
            final String s = strs[i];
            while(num >= v) {
                num -= v;
                sb.append(s);
            }
        }
        return sb.toString();

    }
}
