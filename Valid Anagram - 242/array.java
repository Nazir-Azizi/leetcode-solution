class Solution {
    public boolean isAnagram(String s, String t) {  
        if (s.length() != t.length())
            return false;
        int[] arr = new int[26];
        for(char c : s.toCharArray())
            arr[c - 'a']++;
        for(char c : t.toCharArray()){
            if (arr[c - 'a'] > 0)
                arr[c - 'a']--;
            else
                return false;
        }
        return true;
    }
}
