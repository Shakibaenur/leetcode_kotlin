package blind75.array;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //take a unordered hash map
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            //x+y=target
            //if x=i then y=target-x
            if (map.containsKey(complement)) { //if y exist in map
                return new int[] {map.get(complement), i};// return [map.get element index, and i]
            }
            map.put(nums[i], i);//otherwise add the vlue to map
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}