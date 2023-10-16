package blind75.array;

import java.util.Arrays;

public class FibonacciNumber509 {

    //recursion approach
    //// Recursive
    //// Exponential Time Complexity: O(2^N)
    class Solution {
        public int fiboHelper(int n, int[] dp){
            if(n==0 || n==1) return n;
            if(dp[n]!=-1) return dp[n];
            return dp[n]=fiboHelper(n-1,dp)+fiboHelper(n-2,dp);

        }
        public int fib(int n) {
            int[] dp=new int[n+1];
            Arrays.fill(dp,-1);
            return fiboHelper(n,dp);
        }
    }
    // Memoization
// Time Complexity: O(N)
// Space Complexity: O(N)
    //dynaic programming solution
    class Memoization {
        public int fiboHelper(int n, int[] dp){
            if(n==0 || n==1) return n;
            if(dp[n]!=-1) return dp[n];
            return dp[n]=fiboHelper(n-1,dp)+fiboHelper(n-2,dp);

        }
        public int fib(int n) {
            int[] dp=new int[n+1];
            Arrays.fill(dp,-1);
            return fiboHelper(n,dp);
        }
    }
}
