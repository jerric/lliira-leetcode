package net.lliira.leetcode.r051;

import net.lliira.leetcode.Interval;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 Given a collection of intervals, merge all overlapping intervals.

 For example,
 Given [1,3],[2,6],[8,10],[15,18],
 return [1,6],[8,10],[15,18].
 */
public class P056MergeInterval {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() < 2) return intervals;
        final List<Interval> results = new LinkedList<>();
        final int len = intervals.size();
        final int[] starts = new int[len], ends = new int[len];
        int i = 0;
        for (final Interval interval : intervals) {
            starts[i] = interval.start;
            ends[i++] = interval.end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        Interval interval = new Interval(starts[0], ends[0]);
        results.add(interval);
        for (i = 1; i < len; i++) {
            final int start = starts[i];
            if (start <= interval.end) interval.end = ends[i];
            else {
                interval = new Interval(start, ends[i]);
                results.add(interval);
            }
        }
        return results;
    }
}
