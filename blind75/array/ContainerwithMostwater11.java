package blind75.array;

public class ContainerwithMostwater11 {

    class Solution {
        public int maxArea(int[] height) {
            //Two Pointer approach
            int l=0;//first index of height array
            int r=height.length -1;//last index of height array
            int maxArea=0;// maxArea Holder

            while(l<r){// till the left pointer reach right pointer
                int hl=height[l];//value of left index
                int hr=height[r];//value of right index
                int currentArea=Math.min(hl,hr) * (r-l);//Math.min(hl,hr)[height of the container]=returns the minimum value between left index value and right index value; (r-l)=the difference between r index and l index; And we multiply them to get the currentArea;
                maxArea=Math.max(maxArea,currentArea); // return the maximum value between previous value of maxArea and the the curent area
                if(hl<hr){ //if value of l is lesser that value of r index then increment l otherwise decrement r
                    l++;
                }else{
                    r--;
                }
            }
            return maxArea;

        }
    }

//T.C: O(n)
//S.C: O(1), which means it uses a constant amount of additional space regardless of the input size.
}
