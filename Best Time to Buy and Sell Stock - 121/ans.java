class Solution {
    public int maxProfit(int[] prices) {
        int cheapIndex = 0;
        int profit = 0;
        for (int i = 1; i < prices.length; ++i){
            if (prices[cheapIndex] > prices[i])
                cheapIndex = i;
            else{
                profit = Math.max(profit, prices[i] - prices[cheapIndex]);
            }
        }
        return profit;
    }
}
