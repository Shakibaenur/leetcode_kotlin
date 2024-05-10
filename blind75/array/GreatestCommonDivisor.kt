package blind75.array

class GreatestCommonDivisor {
    class Solution {

        fun gcdOfStrings(str1: String, str2: String): String {
            if(str1.length<str2.length) return  gcdOfStrings(str2,str1)
            if (!str1.startsWith(str2)) return ""
            if (str2.isEmpty()) return str1
            return gcdOfStrings(str1.substring(str2.length),str2)
        }

    }
}

//T.C: O(n)
//S.C: O(n)