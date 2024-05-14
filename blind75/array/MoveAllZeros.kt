package blind75.array

class MoveAllZeros {
        class Solution {
            fun moveZeroes(nums: IntArray): Unit {
                var n=nums.size
                var left=0
                var right=0
                if(n==1){
                    return
                }
                while(right<n){
                    if(nums[right]!=0){
                        var temp=nums[left]
                        nums[left]=nums[right]
                        nums[right]=temp
                        left++
                    }
                    right++
                }
            }

        }
//T.C: O(n)
//S.C: O(1)
}