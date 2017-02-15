package net.lliira.leetcode;

public class Interval {
    public int start = 0;
    public int end = 0;

    public Interval(int s, int e) {
        start = s;
        end = e;
    }

    @Override
    public int hashCode() {
        return start ^ end;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Interval)) return false;
        final Interval interval = (Interval)obj;
        return this.start == interval.start && this.end == interval.end;
    }
}
