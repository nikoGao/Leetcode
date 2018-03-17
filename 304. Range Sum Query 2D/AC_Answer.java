class NumMatrix {
    private int[][] m;
    private int row, col;
    public NumMatrix(int[][] matrix) {
        this.m = matrix;
        row = matrix.length;
        if(row==0) col=0;
        else col = matrix[0].length;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        if(row==0 && col==0) return sum;
        for(int i=Math.max(0, row1); i<=Math.min(row-1, row2); i++){
            for(int j=Math.max(0, col1); j<=Math.min(col-1, col2); j++){
                sum += m[i][j];
            }
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
