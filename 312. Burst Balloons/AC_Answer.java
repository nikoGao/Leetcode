class Solution {
    public int maxCoins(int[] nums) {
        // if we choose i, then we separate nums into two sections
        // to avoid the affect of bursting i and make its left & right neightbour, we think i is the last one to burst
        // then it will multiple nums[-1] * nums[n]
        
        int[] Anums = new int[nums.length + 2];
        int n = 1;
        for(int i:nums){
            if(i>0) Anums[n++] = i;
        }
        Anums[0] = Anums[n++] = 1;
        
        int[][] memo = new int[n][n];
        return burst(Anums, memo, 0, n-1);
    }
    
    public int burst(int[] nums, int[][] memo, int left, int right){
        if(left+1==right) return 0; // as we've already add the last and first element, when two boundaries meet, it means end
        if(memo[left][right]>0) return memo[left][right];
        int ans = 0;
        for(int i=left+1; i<right; i++){
            // i is the last element to burst
            ans = Math.max(nums[left]*nums[i]*nums[right]+burst(nums, memo, left, i) + burst(nums, memo, i, right), ans);
        }
        memo[left][right] = ans;
        return ans;
    }
}
