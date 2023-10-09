package blind75.array;

public class MergeSortedArray88 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            //Two pointer approach but in decrement way
            int i=m-1;//taking last index of nums1
            int j=n-1;//taking last index of nums2
            int k=(m+n)-1;//denote the empty index
            while(i>=0 && j>=0){
                if(nums1[i]>nums2[j]){
                    nums1[k]=nums1[i];
                    k--;
                    i--;
                    //we can write the following 3 lines by post decreasing
                    //nums1[k--]=nums1[i--]
                }else{
                    nums1[k]=nums2[j];
                    k--;
                    j--;
                    //we can write the following 3 lines by post decreasing
                    //nums1[k--]=nums2[j--]
                }
                //after this loop any one array will be empty
            }
            while(i>=0){
                nums1[k--]=nums1[i--];
            }
            while(j>=0){
                nums1[k--]=nums2[j--];
            }
        }
    }

//T.C: O(n+m)
}
