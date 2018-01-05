class Solution {
    public int[][] imageSmoother(int[][] M) {
        int row = M.length;
        int col = M[0].length;
        int[][] output = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int sum = M[i][j];
                int count = 1;
                if(i-1>=0){
                    sum += M[i-1][j];
                    count++;
                }
                if(i+1<row){
                    sum += M[i+1][j];
                    count++;
                }
                if(j-1>=0){
                    sum += M[i][j-1];
                    count++;
                }
                if(j+1<col){
                    sum += M[i][j+1];
                    count++;
                }
                if(i-1>=0 && j-1>=0){
                    sum += M[i-1][j-1];
                    count++;
                }
                if(i-1>=0 && j+1<col){
                    sum += M[i-1][j+1];
                    count++;
                }
                if(i+1<row && j-1>=0){
                    sum += M[i+1][j-1];
                    count++;
                }
                if(i+1<row && j+1<col){
                    sum += M[i+1][j+1];
                    count++;
                }
                output[i][j] = (int)(sum/count);
            }
        }
        return output;
    }
}
