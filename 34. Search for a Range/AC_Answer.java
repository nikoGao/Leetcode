class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int[] result = new int[]{-1, -1};
        if(nums.length==0) return result;
        while(left<right){
            if(nums[left]==target && nums[right]==target) break;
            if(nums[left]<target) left++;
            if(nums[right]>target) right--;
        }
        if(nums[left]==target&&target==nums[right]){
            result[0] = left;
            result[1] = right;
        }
        return result;
    }
}
