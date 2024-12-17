class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int total = 0;
        int buy = 0, sell = 0;
        for (int i = 1; i < prices.length; ++i){
            if (prices[i] > prices[i - 1])
                sell = i;
            else{
                total += (prices[sell] - prices[buy]);
                buy = sell = i;
            }
        }
        total += (prices[sell] - prices[buy]);
        return total;
    }
}
