package grooking

class Pangram {
    class Solution {
        fun checkIfPangram(sentence: String): Boolean {
            return sentence.toSet().size==26
        }
    }
}

//T.C: O(1)
//S.C: O(n)