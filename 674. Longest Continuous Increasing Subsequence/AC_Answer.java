class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0) return 0;
        int length = 1, temp = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]) temp++;
            else{
                length = Math.max(length, temp);
                temp = 1;
            }
        }
        length = Math.max(length, temp);
        return length;
    }
}
