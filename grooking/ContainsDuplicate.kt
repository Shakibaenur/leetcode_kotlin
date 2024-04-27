package grooking

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        nums.sort()
        for(i in 0 until nums.size-1){
            if(nums[i]==nums[i+1])
                return true
        }
        return false
    }
}

//T.C: O(nlogn)
//S.C: O(1)
class Solution1 {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.toSet().size!=nums.size


    }
}
//T.C: O(1)
//S.C: O(n)