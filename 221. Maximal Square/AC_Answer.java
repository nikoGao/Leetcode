class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0) return 0;
        int row = matrix.length, col = matrix[0].length, result = 0;
        int[][] b_matrix = new int[row+1][col+1];
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(matrix[i-1][j-1]=='1'){
                    b_matrix[i][j] = Math.min(Math.min(b_matrix[i][j-1], b_matrix[i-1][j-1]), b_matrix[i-1][j]) + 1;
                    result = Math.max(b_matrix[i][j], result); //store the max width of the square
                }
            }
        }
        return result*result;
    }
}
