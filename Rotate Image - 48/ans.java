class Solution {
    public void rotate(int[][] matrix) {
        int n = (int) matrix.length / 2;
        int up = 0, down = matrix.length - 1;
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < matrix.length; ++j){
                int temp = matrix[up][j];
                matrix[up][j] = matrix[down][j];
                matrix[down][j] = temp;
            }
            up++;
            down--;
        }
        for(int i = 0; i < matrix.length; ++i){
            for(int j = i + 1; j < matrix.length; ++j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
