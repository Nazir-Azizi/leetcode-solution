class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int i = 0, j = col - 1;
        while (i >= 0 && j >= 0 && i < row && j < col){
            if (matrix[i][j] == target)
                return true;
            if (matrix[i][j] > target)
                j--;
            else
                i++;
        }
        return false;
    }
}
