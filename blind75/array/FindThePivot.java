package blind75.array;

public class FindThePivot {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0; // Initialize a variable to store the total sum of all elements in the array.
        int leftSum = 0; // Initialize a variable to store the sum of elements to the left of the current index.

        // Calculate the total sum of all elements in the array.
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array to find the pivot index.
        for (int i = 0; i < nums.length; i++) {
            System.out.println("leftSum: "+leftSum+"totalSum - leftSum - nums[i]: "+(totalSum - leftSum - nums[i]));
            // Check if the sum of elements to the left is equal to the sum of elements to the right.
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // Return the current index as the pivot index.
            }

            // Update the left sum by adding the current element.
            leftSum += nums[i];
        }

        // If no pivot index is found, return -1.
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        pivotIndex(nums);
    }
}
