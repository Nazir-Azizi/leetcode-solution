class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        vector<string> vec;
        if (nums.size() < 1)
            return vec;
        if (nums.size() == 1){
            vec.push_back(to_string(nums[0]));
            return vec;
        }
        long long start = nums[0], end = nums[0];
        bool lastIsIn = false;
        long long p = nums[0];
        for (int i = 1; i < nums.size(); ++i){
            if (++p == nums[i]){
                end = nums[i];
            }else{
                if (start == end)
                    vec.push_back(to_string(start));
                else{
                    string temp = to_string(start);
                    temp += "->";
                    temp += to_string(end);
                    vec.push_back(temp);
                }
                start = nums[i];
                end = start;
                if (i == nums.size() - 1){
                    vec.push_back(to_string(nums[i]));
                    lastIsIn = true;
                    break;
                }
                p = end;
            }
        }
        if (p == end){
            string temp = to_string(start);
            temp += "->";
            temp += to_string(end);
            vec.push_back(temp);
        }
        return vec;
    }
};
