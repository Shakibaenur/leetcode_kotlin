package blind75.array

class ContainerWithMostWater {
    class Solution {
        fun maxArea(height: IntArray): Int {
            var n=height.size
            var left=0
            var right=n-1
            var max=0
            while(left<right){
                var hl=height[left]
                var hr=height[right]
                var area=minOf(hl,hr)*(right-left)
                max=maxOf(max,area)
                if(hl<hr){
                    left++
                }else{
                    right--
                }

            }

            return max
        }
    }
//T.C:O(n)
//S.C:O(1)
}