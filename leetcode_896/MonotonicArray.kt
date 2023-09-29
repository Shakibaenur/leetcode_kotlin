package leetcode_896
/*
* Algorithm:
* We will have an array
* Initialize two boolean variables: isIncreasing and isDecreasing to false
* Start the loop from index 1 compare with its previous element.
* If an element is greater than its previous element then set isIncreasing=true(means the array is increasing)
* If an element is smaller than its previous element then set isDecreasing=true(means the array is decreasing)
* if both isIncreasing and isDecreasing are true then return false and break as the array is neither increasing nor decreasing and we don't have to continue the loop.
was it helpful ... support by upvote.
*/
class MonotonicArray {
    fun isMonotonic(nums: IntArray): Boolean {
        var isIncreasing=false //
        var isDecreasing=false
        for(i in 1 until nums.size){
            if(nums[i]>nums[i-1]){
                isIncreasing=true
            }else if(nums[i]<nums[i-1]){
                isDecreasing= true
            }
            if(isIncreasing && isDecreasing ){
                return false
                break
            }

        }
        return true
    }
}