class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = 200;
        for (int i = 0; i < strs.length; ++i)
            n = Math.min(n, strs[i].length());
        int ans = 0;
        boolean isSame = true;
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < strs.length - 1; ++j){
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)){
                    isSame = false;
                    break;
                }
            }
            if (isSame)
                ans++;
            else
                break;
        }
        return strs[0].substring(0, ans);
    }
}
