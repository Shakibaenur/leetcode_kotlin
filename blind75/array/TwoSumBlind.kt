package blind75.array

class TwoSumBlind {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.sort()
        var left=0
        var right=nums.length
        while(left<right){
            var current_sum=nums[left]+nums[right]
            when(current_sum){
                target->
                    return [nums[left],nums[right]]
                current_sum<target ->
                    left++
                else->
                    right--
            }
        }
        return []
    }
}