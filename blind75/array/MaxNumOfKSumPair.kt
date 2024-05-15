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

    //map solution
    class Solution1 {
        fun maxOperations(nums: IntArray, k: Int): Int {
            var map=mutableMapOf<Int,Int>()
            var count=0
            for(num in nums){
                var target=k-num
                if(map.getOrDefault(target,0)>0){
                    count++
                    map[target]=map.getOrDefault(target,0)-1
                }else{
                    map[num]=map.getOrDefault(num,0)+1
                }
            }
            return count

        }
    }
//T.C: O(n)
//S.C: O(n)
}