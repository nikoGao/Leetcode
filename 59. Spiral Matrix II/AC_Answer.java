class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int start = 1;
        int row = 0, rowend = n-1;
        int col = 0, colend = n-1;
        while(row <= rowend && col <= colend){
            //move right
            for(int i=col; i<=colend; i++){
                matrix[row][i] = start++;
            }
            row++;
            
            for(int j=row; j<=rowend; j++){
                matrix[j][colend] = start++;
            }
            colend--;
            if(row<=rowend){
                for(int i=colend; i>=col; i--){
                    matrix[rowend][i] = start++;
                }
                
            }
            rowend--;
            if(col<=colend){
                for(int i=rowend; i>=row; i--){
                    matrix[i][col] = start++;
                }
                
            }
            col++;
        }
        return matrix;
    }
}
