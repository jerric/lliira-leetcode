package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

import java.util.*;

/**
 You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of
 substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.

 For example, given:
 s: "barfoothefoobarman"
 words: ["foo", "bar"]

 You should return the indices: [0,9].
 (order does not matter).
 */
public class P030StringWord {
    public List<Integer> findSubstring(String s, String[] words) {
        return null;
    }

    private static class Matcher {
        private final int start;
        private final String[] words;
        private final boolean[] matched;
        private ListNode matching;
        private final int wordLength;

        public Matcher(final int start, final String[] words) {
            this.start = start;
            this.words = words;
            this.wordLength = words[0].length();
            this.matched = new boolean[words.length];
            this.matching = new ListNode(-1);
        }

        public boolean hasMatch(final char c, final int i) {
            int diff = (i - this.start) % this.wordLength;
            if (diff == 0) {
                ListNode node = this.matching.next;
                while (node != null) {
                    this.matched[node.val] = true;
                    node = node.next;
                }
                node = this.matching;
                for (int j = 0; j < this.matched.length; j++) {
                    if (!this.matched[i]) {
                        node.next = new ListNode(i);
                        node = node.next;
                    }
                }
            }
            ListNode node = this.matching.next, prev = this.matching;
            while (node != null) {
                final String word = this.words[node.val];
                if (word.charAt(diff) != c) {
                    prev.next = node.next;
                    prev = node;
                    node = node.next;
                }
            }
            return (this.matching.next != null);
        }
    }
}
