package blind75.array

class IsSubsequence {
    class Solution {
        fun isSubsequence(s: String, t: String): Boolean {
            var left=0
            var right=0
            while(left<s.length && right<t.length){
                if(s[left]==t[right]){
                    left++
                }
                right++
            }
            return left==s.length
        }
    }
//T.C: O(n)
//S.C: O(1)
}