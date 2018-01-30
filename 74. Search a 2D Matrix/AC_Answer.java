class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        int start = 0;
        while(start<matrix.length-1){
            if(target>=matrix[start][0] && target<matrix[start+1][0]) break;
            start++;
        }
        int l = 0, r = matrix[0].length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(matrix[start][mid]==target) return true;
            else if(matrix[start][mid]>target) r = mid-1;
            else l = mid+1;
        }
        return false;
    }
}
