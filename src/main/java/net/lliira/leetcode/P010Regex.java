package net.lliira.leetcode;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

/**
 * Created by Jerric on 1/1/2017.
 */
public class P010Regex {


    public boolean isMatch(String s, String p) {
        final RuleFactory ruleFactory = new RuleFactory(p);
        final List<Rule> rules = new ArrayList<>(), nextRules = new ArrayList<>();
        rules.add(ruleFactory.firstRule());
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            boolean hasMatch = false;
            for (final Rule rule : rules) {
                if (rule.isMatch(c)) {
                    hasMatch = true;
                    nextRules.addAll(rule.nextRules());
                }
            }
            if (!hasMatch) return false;
        }
    }

}

interface Rule {

    List<Rule> nextRules();

    boolean isMatch(final char c);
}

class RuleFactory {

    private static abstract class AbstractRule implements Rule{

        final RuleFactory ruleFactory;
        final int index;

        AbstractRule(final RuleFactory ruleFactory, final int index) {
            this.ruleFactory = ruleFactory;
            this.index = index;
        }
    }

    static class CharRule extends AbstractRule {

        private final char c;

        CharRule(final RuleFactory ruleFactory, final int index) {
            super(ruleFactory, index);
            this.c = ruleFactory.pattern.charAt(index);
        }

        @Override
        public List<Rule> nextRules() {
            final Optional<Rule> nextRule = this.ruleFactory.newRule(index + 1);
            return nextRule.isPresent() ? Collections.singletonList(nextRule.get()) : Collections.emptyList();
        }

        @Override
        public boolean isMatch(final char c) {
            return c == this.c;
        }
    }

    static class StarRule extends AbstractRule {

        StarRule(final RuleFactory ruleFactory, final int index) {
            super(ruleFactory, index);
        }

        @Override
        public List<Rule> nextRules() {
            final Optional<Rule> nextRule = this.ruleFactory.newRule(index + 1);
            return nextRule.isPresent() ? Collections.singletonList(nextRule.get()) : Collections.emptyList();
        }

        @Override
        public boolean isMatch(final char c) {
            return true;
        }
    }

    static class DotRule extends AbstractRule {

        DotRule(final RuleFactory ruleFactory, final int index) {
            super(ruleFactory, index);
        }

        @Override
        public List<Rule> nextRules() {
            final List<Rule> nextRules = new ArrayList<>();
            nextRules.add(this);
            this.ruleFactory.newRule(index + 1).ifPresent(nextRules::add);
            return nextRules;
        }

        @Override
        public boolean isMatch(final char c) {
            return true;
        }
    }

    private final String pattern;

    public RuleFactory(final String pattern) {
        this.pattern = pattern;
    }

    public Rule firstRule() {
        return newRule(0).orElseThrow(() -> new RuntimeException("Patten is empty"));
    }

    private Optional<Rule> newRule(final int index) {
        if (index < 0 || index >= pattern.length()) return Optional.empty();
        switch (pattern.charAt(index)) {
            case '*': return Optional.of(new StarRule(this, index));
            case '.': return Optional.of(new DotRule(this, index));
            default: return Optional.of(new CharRule(this, index));
        }
    }
}