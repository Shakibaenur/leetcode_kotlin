package leetcode_1512;

import java.util.Arrays;

public class NumberOfGoodPairsSortApproach {

    //brute force
    //i=0=>j=>i+1
    public int numIdenticalPairs(int[] nums) {
        //find frequency of each  element then add n*(n-1)/2
        //frequency of all element of array
        //1. Map->Time: O(n),Space C.->O(n)
        //2.Sort->Time: O(nlogn),Space C.->O(1)
        Arrays.sort(nums);
        int ans = 0;
        int cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                cnt++;
            } else {
                ans += (cnt * (cnt - 1) / 2);
                cnt = 1;
            }
        }
        ans += (cnt * (cnt - 1) / 2);
        return ans;
    }

}
