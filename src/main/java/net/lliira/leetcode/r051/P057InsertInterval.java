package net.lliira.leetcode.r051;

import net.lliira.leetcode.Interval;

import java.util.List;

/**
 Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

 You may assume that the intervals were initially sorted according to their start times.

 Example 1:
 Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].

 Example 2:
 Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].

 This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
 */
public class P057InsertInterval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int left =0, right = intervals.size() - 1;
        while (left <= right) {
            final int mid = left + (right - left) / 2;
            final Interval itv = intervals.get(mid);
            if (itv.start < newInterval.start) left = mid + 1;
            else right = mid;
        }
    }

    private int search(final List<Interval> intervals, final int target, int from, int to) {
        while (from <= to) {
            final int mid = (from + to) / 2;
            final Interval interval = intervals.get(mid);
            if (interval.start <= target) to = mid;
            else from = mid + 1;
        }
        return  from;
    }
}
