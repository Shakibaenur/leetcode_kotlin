package grooking



class LengthOfLongestSubString {
    fun lengthOfLongestSubstring(s: String): Int {
        var set=mutableSetOf<Char>()
        var left=0
        var right=0
        var maxLength=0
        while(right<s.length){
            var currentChar=s[right]
            if(!set.contains(currentChar)){
                set.add(currentChar)
                maxLength=maxOf(maxLength,right-left+1)
                right++
            }else{
                //remove the previous character
                set.remove(s[left])
                left++
            }
        }
        return maxLength
    }
}
//T.C: O(N)
//S.C: O(1)