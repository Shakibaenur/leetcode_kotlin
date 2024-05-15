package blind75.array

class MaxNumOfKSumPair {
    class Solution {
        fun maxOperations(nums: IntArray, k: Int): Int {
            nums.sort()
            var n=nums.size
            var l=0
            var r=n-1
            var maxOp=0
            while(l<r){
                var sum=nums[l]+nums[r]
                if(sum==k){
                    maxOp++
                    l++
                    r--
                }else if(sum<k){
                    l++
                }else{
                    r--
                }
            }
            return maxOp
        }
    }
//T.C: O(n)
//S.C: O(1)
}