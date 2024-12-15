class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int cheapIndex = 0;
        int profit = 0;
        for (int i = 1; i < prices.size(); ++i){
            if (prices[cheapIndex] > prices[i])
                cheapIndex = i;
            else{
                profit = max(profit, prices[i] - prices[cheapIndex]);
            }
        }
        return profit;
    }
};
