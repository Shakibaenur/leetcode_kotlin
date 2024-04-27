package leetCode75

class MergeStringAlternative {
}

class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        //first take a string builder object
        var result=StringBuilder()
        var length=maxOf(word1.length, word2.length)
        for(i in 0 until length){
            if(i<word1.length)
                result.append(word1[i])

            if(i<word2.length)
                result.append(word2[i])
        }
        return result.toString()

    }
}
//T.C: O(N)
//S.C: O(1)

class Solution1 {
    fun mergeAlternately(word1: String, word2: String): String {
        //two pointer approach
        var result=StringBuilder()
        var right=0
        var left=0

        while(left<word1.length || right<word2.length){
            if(left<word1.length){
                result.append(word1[left])
                left++
            }
            if(right<word2.length){
                result.append(word2[right])
                right++
            }
        }
        return result.toString()

    }
}
//T.C: O(N)
//S.C: O(1)

//Finding minimum length then append the rest of the string
class Solution2 {
    fun mergeAlternately(word1: String, word2: String): String {

        var result=StringBuilder()
        var minLength=minOf(word1.length, word2.length)
        for(i in 0 until minLength){
            result.append(word1[i])
            result.append(word2[i])
        }

        result.append(word1.substring(minOf(word1.length, word2.length)))
        result.append(word2.substring(minOf(word1.length, word2.length)))
        return result.toString()

    }
}
//T.C: O(N)
//S.C: O(1)