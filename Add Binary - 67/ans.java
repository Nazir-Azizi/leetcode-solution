class Solution {
    public String addBinary(String a, String b) {

        int first = a.length() - 1;
        int second = b.length() - 1;
        boolean carry = false;
        StringBuilder resultString = new StringBuilder();

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        while (first >= 0 && second >= 0){
            if (aArray[first] == bArray[second] && carry){
                if (aArray[first] == '1')
                    resultString.append('1');
                else{
                    resultString.append('1');
                    carry = false;
                }
            }
            else if (aArray[first] == bArray[second] && !carry){
                if (aArray[first] == '1'){
                    resultString.append('0');
                    carry = true;
                }else{
                    resultString.append('0');
                    carry = false;
                }
            }else {
                if (carry)
                    resultString.append('0');
                else
                    resultString.append('1');
            }
            first--; second--;
        }
        // System.out.println(resultString.toString());


        while (first >= 0){
            if (aArray[first] == '1'){
                if (carry)
                    resultString.append('0');
                else
                    resultString.append('1');
            }else{
                if (carry){
                    resultString.append('1');
                    carry = false;
                }
                else
                    resultString.append('0');
            }
            first--;
        }

        while (second >= 0){
            if (bArray[second] == '1'){
                if (carry)
                    resultString.append('0');
                else
                    resultString.append('1');
            }else{
                if (carry){
                    resultString.append('1');
                    carry = false;
                }
                else
                    resultString.append('0');
            }
            second--;
        }
        if (carry)
            resultString.append('1');
        return resultString.reverse().toString();
    }
}
