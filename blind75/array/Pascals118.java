package blind75.array;

import java.util.ArrayList;
import java.util.List;

public class Pascals118 {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();

            for (int i = 0; i < numRows; i++) {
                List<Integer> row = new ArrayList<>();
                if (i == 0) {
                    row.add(1);
                } else {
                    List<Integer> prevRow = result.get(i - 1);
                    row.add(1); // The first element in each row is always 1.

                    for (int j = 1; j < i; j++) {
                        int sum = prevRow.get(j - 1) + prevRow.get(j);
                        row.add(sum);
                    }

                    row.add(1); // The last element in each row is always 1.
                }

                result.add(row);
            }

            return result;
        }
    }
}
