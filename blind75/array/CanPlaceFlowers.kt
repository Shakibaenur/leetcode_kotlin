package blind75.array

class CanPlaceFlowers {
    class Solution {
        fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
            var count = 0
            var i = 0

            while(i<flowerbed.size){
                if(flowerbed[i]==0 &&
                    (i == 0 || flowerbed[i-1]==0)
                    && (i==flowerbed.size-1 || flowerbed[i+1]==0)){
                    flowerbed[i]=1
                    count++
                }
                i++
            }

            return count >= n
        }
    }
}
//T.C: O(n)
//S.C: O(1)