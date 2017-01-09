package net.lliira.leetcode;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

/**
 * Created by Jerric on 1/1/2017.
 */
public class P010Regex {

    private static class Rule {
        private final char p;
        private final int index;
        private boolean single = true;

        private Rule(final char p, final int index) {
            this.p = p;
            this.index = index;
        }
    }

    public boolean isMatch(String s, String p) {
        if (p == null || p.isEmpty() || s == null || s.isEmpty()) return false;

        final Rule[] rules = new Rule[p.length()];
        final int rulesLength = parse(p, rules);
        if (rulesLength == 0) return false;
        Set<Rule> currentRules = new HashSet<>(), nextRules = new HashSet<>();
        currentRules.add(rules[0]);
        for (int i = 0; i < s.length() - 1; i++) {
            final char c = s.charAt(i);
            for (final Rule rule : currentRules) {
                if (!rule.single || c == rule.p || '.' == rule.p) {
                    if (rule.index < rulesLength - 1) nextRules.add(rules[rule.index + 1]);
                    if (!rule.single) nextRules.add(rule);
                }
            }
            if (nextRules.isEmpty()) return false;
            currentRules = nextRules;
            nextRules = new HashSet<>();
        }

        // match the last char
        final char c = s.charAt(s.length() - 1);
        for (final Rule rule : currentRules) {
            if (rule.index == rulesLength - 1 && (rule.p == c || rule.p == '.')) return true;
        }
        return false;
    }

    private int parse(final String pattern, final Rule[] rules) {
        int ruleLength = 0;
        for (int i = 0; i < pattern.length(); i++) {
            final char c = pattern.charAt(i);
            if (c == '*' && ruleLength > 0) rules[ruleLength - 1].single = false;
            else {
                rules[ruleLength] = new Rule(c, ruleLength);
                ruleLength++;
            }
        }
        return ruleLength;
    }

}
