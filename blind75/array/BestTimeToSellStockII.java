package blind75.array;

/*
=>an integer array prices where prices[i] is the price of a given stock on the ith day.
=>On each day, you may decide to buy and/or sell the stock.
=>You can only hold at most one share of the stock at any time.
=>However, you can buy it then immediately sell it on the same day.
=>Find and return the maximum profit you can achieve.
Algorithm:
=>need to find a pattern whether the ith value is greater than i-1 value
=>Single loop i will start from 1
=>profit =prices[i]+prices[i-1]
*/


public class BestTimeToSellStockII {
    class Solution {
        public int maxProfit(int[] prices) {
            int profit=0;
            //Base condition to check whether the array length is greater than 2
            if(prices.length < 2 ) return 0;
            //need to check whether index value is greater than index-1 value
            for(int i=1;i<prices.length;i++){
                if(prices[i]>prices[i-1]){
                    profit+=prices[i]-prices[i-1];
                }
            }
            return profit;
        }
    }
}
//T.C: O(n)
//S.C: O(n)