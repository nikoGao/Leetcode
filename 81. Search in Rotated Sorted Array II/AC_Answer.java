class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target) return true;
            if(nums[mid]<nums[right] || nums[mid] < nums[left]){
                if(nums[mid] < target && nums[right] >= target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }else if(nums[mid] > nums[left] || nums[mid] > nums[right]){
                if(nums[mid]>target && nums[left] <= target){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                left++;
            }
        }
        return false;
    }
}
