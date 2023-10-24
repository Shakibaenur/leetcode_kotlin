package blind75.array;

import java.util.Arrays;
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



class Solution1 {
    //Time Limit Exit
    public int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int n=nums.length-1;
        Arrays.sort(nums);
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                ans[0]=nums[left];
                ans[1]=nums[right];
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}