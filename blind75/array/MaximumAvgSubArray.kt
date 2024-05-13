package blind75.array

class MaximumAvgSubArray {

    class Solution {
        fun findMaxAverage(nums: IntArray, k: Int): Double {
            var maxSum=0
            var sum=0
            for(i in 0 until k){
                sum+=nums[i]//find out the sum this k length
            }
            maxSum=sum
            for(i in k until nums.size){
                sum+=nums[i]-nums[i-k]
                maxSum=maxOf(sum,maxSum)
            }
            return maxSum.toDouble()/k
        }
    }

//T.C: O(n)
//S.C: O(1)

//Algorithm:
//find out the sum till k th element
//asign sum to maxSum
// loop from k till array size
// sum = sum+ new element - the element sliding back from window
// finally divuide to find average
}