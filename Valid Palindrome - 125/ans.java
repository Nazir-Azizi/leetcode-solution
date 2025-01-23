class Solution {
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end){
            if (!Character.isLetter(s.charAt(start)) && !Character.isDigit(s.charAt(start)))
                start++;
            else if (!Character.isLetter(s.charAt(end)) && !Character.isDigit(s.charAt(end)))
                end--;
            else if (Character.toLowerCase(s.charAt(start++)) ==
            Character.toLowerCase(s.charAt(end--)))
                continue;
            else
                return false;
        }
        return start >= end;
    }
}
