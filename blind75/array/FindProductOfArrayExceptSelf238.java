package blind75.array;

public class FindProductOfArrayExceptSelf238 {

    public static int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];

        answer[0]=1;

        for(int i=1;i<nums.length;i++){
            answer[i]= answer[i-1]* nums[i-1];
        }
        System.out.println("answer: 13"+answer.toString());

        int suffixProduct=1;

        for(int i=nums.length-1;i>=0;i--){
            answer[i] *=suffixProduct;
            System.out.println("answer: 19  answer[i]:"+ answer[i]+" "+i);
            suffixProduct *=nums[i];
            System.out.println("answer: 21  suffixProduct"+ answer[i]+" "+i);
        }
        return answer;
    }

//    T.C:O(N)
//    S.C:O(1)

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        productExceptSelf(nums);

    }
}
