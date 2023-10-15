package blind75.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {

    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
            if (map.get(a) > n / 2) {
                return a;
            }
        }
        return -1;
        //T.C: O(n)
    }

    public int majorityElement2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n / 2];

        //T.C: nlogn //because of sort
        //S.C:O(1)

    /*After sorting, it returns the element at the middle index, which is nums[n/2].
    This element may or may not be the majority element.
If the majority element exists in the array (an element that appears more than n/2 times),
then it's guaranteed to be the element at index n/2 after sorting because the majority
element occurs more than n/2 times, and when the array is sorted, it will be in the middle.*/
    }

    //Most optimal solution
    class Solution {
        //Mores Algorithm
        //Boyer-Moore Voting Algorithm
        public int majorityElement(int[] nums) {
            int candidate=0;
            int vote=0;
            for(int num:nums){
                if(vote==0){
                    candidate=num;
                }
                if(candidate==num){
                    vote++;
                }else vote--;
            }
            return candidate;
        }

        //T.C: O(n)
        //S.C: O(1)
    }


}

