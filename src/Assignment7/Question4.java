package Assignment7;

import java.util.*;

public class Question4 {

    public class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }


    private class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval a, Interval b) {
            return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new IntervalComparator());

        LinkedList<Interval> result = new LinkedList<Interval>();
        for (Interval interval : intervals) {
            if (result.isEmpty() || result.getLast().end < interval.start) {
                result.add(interval);
            }
            else {
                result.getLast().end = Math.max(result.getLast().end, interval.end);
            }
        }

        return result;
    }
}

