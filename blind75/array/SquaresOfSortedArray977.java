package blind75.array;

public class SquaresOfSortedArray977 {

    class Solution {
        public int[] sortedSquares(int[] nums) {
            int n=nums.length;
            int[] result=new int[n];
            int l=0; //pointer to left index
            int r=n-1;//pointer to right index
            int index=n-1;//index of new array

            while(l<=r){
                int ls=nums[l]*nums[l];
                int rs=nums[r]*nums[r];
                if(ls>rs){
                    result[index]=ls;
                    l++;
                }else{
                    result[index]=rs;
                    r--;
                }
                index--;
            }
            return result;
        }
    }

    //T.C: O(n)
    //S.C: O(n)

    /*Time Complexity:
The time complexity of this solution is O(n), where 'n' is the number of elements in the input array 'nums.' Here's why:

We use two pointers, 'left' and 'right,' which traverse the input array from the beginning and end.
In the worst case, these pointers each move from one end of the array to the other, so they collectively traverse the entire array once.

While moving the pointers and filling the result array, we perform a constant amount of
work for each element in the input array. This results in a linear time complexity, O(n).

Space Complexity:
The space complexity is O(n) as well. Here's why:

We create a new array, 'result,' to store the squared values of the input array.
The size of this 'result' array is equal to the number of elements in the input array, which is 'n.'

We use a few extra integer variables (e.g., 'left,' 'right,' and 'index')
that do not depend on the size of the input array. They have constant space complexity,
so they don't contribute significantly to the overall space complexity.

In summary, the time and space complexity of this solution is O(n), making it an efficient
and linear time solution for the "Squares of a Sorted Array" problem.
    * */
}
