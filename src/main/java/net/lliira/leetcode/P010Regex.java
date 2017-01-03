package net.lliira.leetcode;

import java.util.Set;

/**
 * Created by Jerric on 1/1/2017.
 */
public class P010Regex {


    public boolean isMatch(String s, String p) {

    }

}

interface Rule {

    Rule nextRule();

    boolean isMatch(final String s, final int i);

    void postMatch(final Set<Rule> nextRules);

    public static class CharRule implements Rule {

        private final String pattern;
        private final int index;

        public CharRule(final String pattern, final int index) {
            this.pattern = pattern;
            this.index = index;
        }

        @Override
        public Rule nextRule() {
            return null;
        }

        @Override
        public boolean isMatch(String s, int i) {
            return false;
        }

        @Override
        public void postMatch(Set<Rule> nextRules) {

        }
    }
}