package blind75.array

class ReverseWordsinString {
    fun reverseWords(s: String): String {
        var output=s.split(" ").filter{it.isNotEmpty()}//"[the, sky, is, blue]"
        return output.reversed().joinToString(separator=" ")
    }
}

/*
* Time Complexity:

The split(" ") function splits the input string s into an array of substrings based on whitespace characters. This operation takes O(n) time, where n is the length of the input string s.
The filter { it.isNotEmpty() } function filters out empty strings from the resulting array. This operation also takes O(n) time, where n is the length of the array.
The reversed() function reverses the resulting array. This operation takes O(n) time.
The joinToString(separator = " ") function concatenates the elements of the array into a single string, separated by spaces. This operation also takes O(n) time, where n is the length of the array.
Overall, the time complexity of the function is O(n).
*
Space Complexity:

The split(" ") function creates a new array to store the substrings, which can take up to O(n) space.
The filter { it.isNotEmpty() } function creates a new array to store the filtered substrings, which can take up to O(n) space.
The reversed() function doesn't create additional space; it just reverses the existing array in-place.
The joinToString(separator = " ") function creates a new string to store the concatenated substrings, which can take up to O(n) space.
Overall, the space complexity of the function is O(n).
* */