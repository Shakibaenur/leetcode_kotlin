package blind75.array;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate217 {
    //Brute Force approach

    class Solution {
        public boolean containsDuplicate(int[] nums) {
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==nums[i]){
                        return true;
                    }
                }
            }
            return false;
        }
    }

    //But in leetcode it will take time limit exit
    //T.C: O(N^2)
    //S.C: O(1)


    class Solution2 {
        public boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i]==nums[i-1]){
                    return true;
                }
            }
            return false;
        }
    }
    //T.C: O(NlogN)
    //S.C: O(1)// as we did not use any extra data structure

    class Solution3 {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<nums.length;i++){
                set.add(nums[i]);
            }
            // if it contains duplicate then the size of
            // set will not equal to the length
            // of the array
            if(set.size()!=nums.length)
                return true;
            return false;
        }
    }

    //T.C: O(N)
    //S.C: O(N)

}
