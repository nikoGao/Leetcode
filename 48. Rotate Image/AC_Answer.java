class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length, mid = 0;
        if(n%2==0) mid = n/2;
        else mid = n/2 + 1;
        for(int i=0; i<mid; i++){
            for(int j=i; j<n-1-i; j++){
                int temp = matrix[i][n-1-j];
                matrix[i][n-1-j] = matrix[j][i];
                int temp2 = matrix[n-1-j][n-1-i];
                matrix[n-1-j][n-1-i] = temp;
                int temp3 = matrix[n-1-i][j];
                matrix[n-1-i][j] = temp2;
                matrix[j][i] = temp3;
            }
        }
    }
}
