class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        if(len>1){
            int non = 0;
            for(int num:nums){
                if(num!=0) nums[non++]=num;
            }
            while(non<len){
                nums[non++]=0;
            }
        }
    }
}
