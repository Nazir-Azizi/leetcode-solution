class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        int n = s.length();
        StringBuilder str = new StringBuilder();
        int jump = (numRows - 1) * 2;
        for(int i = 0; i < numRows ; i++){
            int j = i;
            if (i == 0 || i == numRows - 1){
                jump = (numRows - 1) * 2;
                while (j < n){
                    str.append(s.charAt(j));
                    j += jump;
                }
            }else{
                jump -= 2;
                int tempJump = (numRows - 1) * 2 - jump;
                while (j < n){
                    str.append(s.charAt(j));
                    tempJump = ((numRows - 1) * 2 - tempJump);
                    j += tempJump;
                }
            }
            
        }
        return str.toString();
    }
}
