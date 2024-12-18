class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if (nums.size() == 0)
            return 0;
        int c = 1;
        int location = 1;
        for (int i = 1; i < nums.size(); ++i){
            if (nums[i] == nums[i - 1])
                c++;
            else
                c = 1;
            if (c <= 2){
                nums[location++] = nums[i];
            }
        }
        return location;
    }
};
