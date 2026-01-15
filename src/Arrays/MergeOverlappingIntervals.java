package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {
    void main() {
        int[][] nums = {{1,3}, {2,6}, {8,9}, {9,11}, {8,10}, {2,4}, {15,18},{16,17}};
        System.out.println(Arrays.deepToString(merge(nums)));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> res = new ArrayList<>();
        int[] interval = intervals[0];

        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] <= interval[1]) {
                interval[1] = Math.max(intervals[i][1], interval[1]);
            } else {
                res.add(interval);
                interval = intervals[i];
            }
        }

        res.add(interval);
        return res.toArray(new int[res.size()][]);
    }
}
