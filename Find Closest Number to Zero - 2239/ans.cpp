class Solution {
public:
    int findClosestNumber(vector<int>& nums) {
        int ansIndex = 0;
        for (int i = 1; i < nums.size(); ++i){
            if (abs(nums[i]) < abs(nums[ansIndex]))
                ansIndex = i;
            else if (abs(nums[i]) == abs(nums[ansIndex]))
                if (nums[i] > nums[ansIndex])
                    ansIndex = i;

        }
        return nums[ansIndex];
    }
};
