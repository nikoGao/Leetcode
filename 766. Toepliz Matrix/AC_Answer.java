class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        boolean truth = true;
        for(int i=0; i<M; i++){
            int j = 0, start = i;
            while(start<M && j<N)
                truth &= (matrix[start++][j++]==matrix[i][0]);
        }
        for(int i=0; i<N; i++){
            int start = 0, j = i;
            while(j<N && start<M){
                truth &= (matrix[start++][j++] == matrix[0][i]);
            }
        }
        return truth;
    }
}
