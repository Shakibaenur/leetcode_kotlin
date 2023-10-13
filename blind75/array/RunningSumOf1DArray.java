package blind75.array;

public class RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        int[] newArray=new int[nums.length];
        newArray[0]=nums[0];
        if(nums.length>1){
            for(int i=1;i<nums.length;i++){
              newArray[i]=newArray[i-1]+nums[i];
            }
        }
        return newArray;
    }
}
