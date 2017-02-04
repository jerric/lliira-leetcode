package net.lliira.leetcode.r001;

import net.lliira.leetcode.LinkNode;

/**
 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class P020Parenthese {
    public boolean isValid(String s) {
        final LinkNode<Character> bottom = new LinkNode(' ', null);
        LinkNode<Character> top = bottom;
        for (int i = s.length() - 1; i >= 0; i--) {
            final char c = s.charAt(i);
            char counter = ' ';
            if (c == ')' || c == '}' || c == ']') {
                top = new LinkNode<>(c, top);
            } else {
                if (c == '(') counter = ')';
                else if (c == '{') counter = '}';
                else if (c == '[') counter = ']';

                if (counter == ' ' || top.value != counter) return false;
                top = top.next;
            }
        }
        return (top == bottom);
    }
}
