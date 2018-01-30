class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> rows = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]==0){
                    int[] pair = new int[]{i, j};
                    rows.add(pair);
                }
            }
        }
        for(int[] pair:rows){
            for(int j=0; j<matrix[0].length; j++) matrix[pair[0]][j] = 0;
            for(int i=0; i<matrix.length; i++) matrix[i][pair[1]] = 0;
        }
    }
}
