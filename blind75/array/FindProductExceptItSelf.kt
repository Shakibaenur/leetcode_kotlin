package blind75.array

class FindProductExceptItSelf {

    class Solution {
        fun productExceptSelf(nums: IntArray): IntArray {
            var leftProduct=1
            var rightProduct=1
            var numsSize=nums.size
            var resultArray=IntArray(numsSize)
            for (i in 0 until numsSize){
                resultArray[i]=leftProduct
                leftProduct=leftProduct*nums[i]
            }

            for (i in numsSize-1 downTo 0){
                resultArray[i]=resultArray[i]*rightProduct
                rightProduct=rightProduct*nums[i]
            }
            return resultArray
        }
    }
//T.C: O(n)
//S.C: The function uses additional space to store the result array, which has the same size as the input array.
// It also uses a constant amount of space for variables such as leftProduct, rightProduct, and loop counters.
// Therefore, the overall space complexity is O(n), where n is the number of elements in the input array.

}