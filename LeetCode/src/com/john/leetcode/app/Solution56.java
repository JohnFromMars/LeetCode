package com.john.leetcode.app;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Given a collection of intervals, merge all overlapping intervals.

For example,
Given [1,3],[2,6],[8,10],[15,18],
return [1,6],[8,10],[15,18].


 * 
 */
public class Solution56 {

	public class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Interval> merge(List<Interval> intervals) {
		// null set check
		if (intervals.size() == 0 || intervals.size() == 1) {
			return intervals;
		}

		int start = intervals.get(0).start;
		int end = intervals.get(0).end;

		List<Interval> result = new ArrayList<>();
		// sort the all interval
		intervals.sort((i1, i2) -> (Integer.compare(i1.start, i2.start)));

		for (Interval interval : intervals) {
			// when overlap
			if (end >= interval.start) {
				end = Math.max(end, interval.end);
				start = Math.min(start, interval.start);
			}

			// when not overlap
			if (end < interval.start) {
				result.add(new Interval(start, end));
				start = interval.start;
				end = interval.end;

			}
		}

		// last missing round

		result.add(new Interval(start, end));

		return result;
	}

}
