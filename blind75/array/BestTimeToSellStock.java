package blind75.array;

public class BestTimeToSellStock {
    public int maxProfit(int[] prices) {
        //Two pointer approach
        //Time goes from only one direction so for first index we can not take it
        //Left= Buy
        //Right= Sell
        //first Base condition
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int buyLeft = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            int sellRight = prices[i];
            if (buyLeft > sellRight) {
                buyLeft = prices[i];
            } else {
                int profit = sellRight - buyLeft; // Calculate profit
                if (profit > max) {
                    max = profit; // Update max profit if a higher profit is found
                }
            }
        }

        return max;
    }

//T.C: O(n)
//S.C: O(1)
}
