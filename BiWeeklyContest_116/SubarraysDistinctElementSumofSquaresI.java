package BiWeeklyContest_116;

import java.util.HashSet;
import java.util.List;

public class SubarraysDistinctElementSumofSquaresI {
    class Solution {
        public int sumCounts(List<Integer> nums) {
            int n = nums.size();
            int result = 0;

            for (int start = 0; start < n; start++) {
                HashSet<Integer> distinctSet = new HashSet<>();
                for (int end = start; end < n; end++) {
                    distinctSet.add(nums.get(end));
                    result += distinctSet.size() * distinctSet.size();
                }
            }

            return result;
        }
    }
}
//T.C: O(N^2)
//S.C: O(N)
