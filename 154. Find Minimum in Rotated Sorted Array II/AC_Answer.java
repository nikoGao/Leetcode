class Solution {
    public int findMin(int[] nums) {
        int low = 0, hi = nums.length-1, mid = 0;
        while(low<hi){
            mid = (low+hi)/2;
            if(nums[mid]>nums[hi]) low = mid+1;
            else if(nums[mid]<nums[hi]) hi = mid; // maybe it's the pivot or near the pivot
            else hi--; // if meet same value, move low or hi
        }
        return nums[low];
    }
}
