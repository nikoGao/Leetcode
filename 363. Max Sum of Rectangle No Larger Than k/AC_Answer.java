class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        // first use dp to sum up all area[i][j]
        // then search all area with && remove it's left upper
        int m = matrix.length;
        if(m==0) return 0;
        int n = matrix[0].length;
        int[][] area = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                area[i][j] += matrix[i][j];
                if(i>0) area[i][j] += area[i-1][j];
                if(j>0) area[i][j] += area[i][j-1];
                if(i>0 && j>0) area[i][j] -= area[i-1][j-1];
            }
        }
        int max = Integer.MIN_VALUE;
        for(int row1 = 0; row1<m; row1++){
            for(int row2 = row1; row2<m; row2++){
                TreeSet<Integer> set = new TreeSet<>();
                set.add(0);
                for(int col = 0; col<n; col++){
                    int right = area[row2][col];
                    if(row1-1>=0) right -= area[row1-1][col];
                    Integer ceiling = set.ceiling(right-k);
                    if(ceiling!=null) max = Math.max(max, right-ceiling);
                    set.add(right);
                }
                    
            }
        }
        return max;
    }
}
