package grooking


class ReverseVowel {
    fun reverseVowels(s: String): String {
        var left=0
        var right=s.length-1
        var charArray=s.toCharArray()

        while(left<right){
            if(!isVowel(charArray[left])){
                left++
            }
            else if(!isVowel(charArray[right])){
                right--
            }else{
                swap(left,right,charArray)
                left++
                right--
            }

        }
        return String(charArray)
    }
    fun swap(s1:Int,s2:Int,ch:CharArray){
        var temp=ch[s1]
        ch[s1]=ch[s2]
        ch[s2]=temp
    }
    fun isVowel(s:Char):Boolean{
        var ch=s.toLowerCase()
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
    }
}
//T.C:O(N)
//S.C: O(1)