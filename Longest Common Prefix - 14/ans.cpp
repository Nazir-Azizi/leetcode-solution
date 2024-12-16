class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int n = 200;
        for (int i = 0; i < strs.size(); ++i){
            if (strs[i].size() < n)
                n = strs[i].size();
        }
        int ans = 0;
        bool isSame = true;
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < strs.size() - 1; ++j){
                if (strs[j][i] != strs[j + 1][i]){
                    isSame = false;
                    break;
                }
            }
            if (isSame)
                ans++;
            else
                break;
        }
        return strs[0].substr(0, ans);
    }
};
