package blind75.array;

public class MaximumSubArray53 {
    class Solution {
        public int maxSubArray(int[] nums) {
            //e.g: if [-1] it should return [-1] not 0
            int maximum=nums[0];
            int sum=nums[0];

            //Kadanes algorithm which store the max value till current index and then another variable checks the max value till the end index
            for(int i=1;i<nums.length;i++){
                sum=Math.max(nums[i],sum+nums[i]);
                maximum=Math.max(maximum,sum);

            }
            return maximum;
        }
    }

//T.C: O(N)
//S.C: O(1)
}
