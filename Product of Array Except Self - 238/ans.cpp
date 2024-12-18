class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int product = 1;
        int zero = 0;
        for (int i = 0; i < nums.size(); ++i){
            if (nums[i] == 0)
                zero++;
            else
                product *= nums[i];
        }

        vector<int> ans(nums.size());
        
        for (int i = 0; i < nums.size(); ++i){
            if (zero > 1){
                ans[i] = 0;
            }else if (zero == 1){
                if (nums[i] == 0)
                    ans[i] = product;
                else
                    ans[i] = 0;
            }else{
                ans[i] = product / nums[i];
            }
        }
        return ans;
    }
};
