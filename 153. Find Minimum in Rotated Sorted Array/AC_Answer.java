class Solution {
    public int findMin(int[] nums) {
        if(nums[nums.length-1]>nums[0]) return nums[0];
        int l = 0, r = nums.length-1, mid =0;
        while(l<r){
            if(nums[l]<nums[r]) return nums[l];
            mid = (l + r)/2;
            if(nums[mid]> nums[r]) l = mid+1;
            else r = mid;
        }
        return nums[l];
    }
}
