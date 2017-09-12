// division, runtime 6ms

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if (nums[mid] > target){
                end = mid-1;
            }else if(nums[mid] < target){
                start = mid +1;
            }else if(nums[mid]==target){
                return mid;
            }
        }
        if (target > nums[start]) return start+1;
        else return start;
    }
}
