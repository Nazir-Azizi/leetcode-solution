class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int up = 0, left = 0;
        int right = matrix[0].length, down = matrix.length;
        int i = 0;
        while (up < down && left < right){
            for(i = left; i < right; i++)
                list.add(matrix[up][i]);
            up++;
            for(i = up; i < down; ++i)
                list.add(matrix[i][right - 1]);
            right--;
            if (up < down){
                for(i = right - 1; i >= left; --i)
                    list.add(matrix[down - 1][i]);
                down--;
            }
            if (left < right){
                for(i = down - 1; i >= up; --i)
                    list.add(matrix[i][left]);
                left++;
            }
        }
        return list;
    }
}
