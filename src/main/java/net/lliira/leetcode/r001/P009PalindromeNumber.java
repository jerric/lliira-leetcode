package net.lliira.leetcode.r001;

/**
 Determine whether an integer is a palindrome. Do this without extra space.

 click to show spoilers.

 Some hints:
 Could negative integers be palindromes? (ie, -1)

 If you are thinking of converting the integer to string, note the restriction of using extra space.

 You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the
 reversed integer might overflow. How would you handle such case?

 There is a more generic way of solving this problem.
 */
public class P009PalindromeNumber {
    static final int maxd = Integer.MAX_VALUE / 10, maxm = Integer.MAX_VALUE % 10;
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int r = 0, a= x;
        while (a > 0) {
            int d = a % 10;
            if (r >=maxd || r == maxd && d > maxm) return false;
            r = r * 10 + d;
            a /= 10;
        }
        return (r == x);
    }

}
