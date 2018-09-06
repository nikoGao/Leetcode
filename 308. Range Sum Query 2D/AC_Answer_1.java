class NumMatrix {
    // this binary indexed tree, parent is on the last row and col, previous are all child
    // this enable update only be O(logn*logm) time
    
    int[][] tree;
    int[][] nums;
    int N=0, M=0;

    public NumMatrix(int[][] matrix) {
        N = matrix.length;
        if(N!=0){
            M = matrix[0].length;
            tree = new int[N+1][M+1];
            nums = new int[N][M];
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    update(i, j, matrix[i][j]);
                }
            }
        }
    }
    
    public void update(int row, int col, int val) {
        if(M==0 || N==0) return;
        int diff = val - nums[row][col];
        nums[row][col] = val;
        // the first line and col is filled with 0
        // each i & j in the same level of tree have same number of 1 bit, i = i + i&(-i) add 1 to it's last 1 bit
        for(int i=row+1; i<N+1; i += i&(-i)){
            for(int j=col+1; j<M+1; j+=j&(-j)){
                tree[i][j] += diff;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum(row2+1, col2+1) + sum(row1, col1) - sum(row1, col2+1) - sum(row2+1, col1);
    }
    
    public int sum(int row, int col){
        int sum = 0;
        for(int i=row; i>0; i-=i&(-i)){
            for(int j=col; j>0; j-=j&(-j)){
                sum += tree[i][j];
            }
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * obj.update(row,col,val);
 * int param_2 = obj.sumRegion(row1,col1,row2,col2);
 */
