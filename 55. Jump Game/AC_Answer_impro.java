class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int reach = 0;
        for(int i=0; i<n && i<=reach; i++){
            // use i<=reach to make sure current index can be reached through previous jumps
            reach = Math.max(i+nums[i], reach);
        }
        return reach>=n-1;
    }
    
}
