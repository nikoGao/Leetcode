class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        //As a circle, rob 0, not rob n-1; else: rob n-1, not rob 0
        return Math.max(rob_helper(nums, 0, nums.length-2), rob_helper(nums, 1, nums.length-1));
    }
    
    public int rob_helper(int[] nums, int start, int end){
        int inclusive=0, exclusive=0;
        for(int j=start; j<=end; j++){
            int i=inclusive, e=exclusive;
            inclusive = e+nums[j];
            exclusive = Math.max(i, e);
        }
        return Math.max(inclusive, exclusive);
    }
}
