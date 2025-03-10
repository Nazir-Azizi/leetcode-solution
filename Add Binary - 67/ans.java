class Solution {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder rs = new StringBuilder();

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        while (i >= 0 || j >= 0 || carry > 0){
            int aN = (i >= 0) ? aArray[i] - '0' : 0;
            int bN = (j >= 0) ? bArray[j] - '0' : 0;

            int sum = aN + bN + carry;
            int digit = sum % 2;
            carry = sum / 2;

            i--;
            j--;

            rs.append((char) (digit + '0'));
        }
        return rs.reverse().toString();
    }
}
