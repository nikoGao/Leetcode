class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(r*c != nums.length*nums[0].length) return nums;
        int[][] output = new int[r][c];
        int[] temp = new int[nums.length*nums[0].length];
        int z = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                temp[z++] = nums[i][j];
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                output[i][j] = temp[i*c+j];
            }
        }
        return output;
    }
}
