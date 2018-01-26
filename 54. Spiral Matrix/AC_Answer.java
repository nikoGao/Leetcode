class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length==0) return res;
        int row = 0, rowend = matrix.length-1;
        int col = 0, colend = matrix[0].length-1;
         while (row <= rowend && col <= colend) {
            // Traverse Right
            for (int j = col; j <= colend; j ++) {
                res.add(matrix[row][j]);
            }
            row++;
            
            // Traverse Down
            for (int j = row; j <= rowend; j ++) {
                res.add(matrix[j][colend]);
            }
            colend--;
            
            if (row <= rowend) {
                // Traverse Left
                for (int j = colend; j >= col; j --) {
                    res.add(matrix[rowend][j]);
                }
            }
            rowend--;
            
            if (col <= colend) {
                // Traver Up
                for (int j = rowend; j >= row; j --) {
                    res.add(matrix[j][col]);
                }
            }
            col++;
        }
        return res;
    }
}
