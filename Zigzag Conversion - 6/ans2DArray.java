class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length())
            return s;
        List<Character>[] arr = new ArrayList[numRows];
        for(int i = 0; i < numRows; ++i)
            arr[i] = new ArrayList<>();
        int index = 0;
        int d = 0;

        for(char c: s.toCharArray()){
            arr[index].add(c);
            if (index == 0)
                d = 1;
            else if (index == numRows - 1)
                d = -1;
            index += d;
        }
        StringBuilder str = new StringBuilder();
        for(List<Character> list: arr)
            for(char c: list)
                str.append(c);
        return str.toString();
    }
}
