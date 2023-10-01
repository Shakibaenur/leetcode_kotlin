package leetcode_577


/*
* Algorithm:
* split the string by space
* store the split words to an array: wordArray
* now reverse each word of the wordArray to reversedWordArray
* join each word of reversedWordArray to string
* */
class ReverseString {
    fun reverseWords(s: String): String {
        var wordArray=s.split(" ")
        var reversedWordArray=wordArray.map{it.reversed()}
        // return s.split(" ").map{it.reversed()}.joinToString(" ")
        return reversedWordArray.joinToString(" ")
    }
}