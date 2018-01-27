class Solution {
    public boolean canJump(int[] nums) {
        int num = 0;
        for(int i=0; i<nums.length; i++){
            if(i>num) return false;
            else num = Math.max(i+nums[i], num);
        }
        return true;
    }
}
