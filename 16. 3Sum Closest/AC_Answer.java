class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0]+ nums[1] + nums[nums.length-1], value = 0;
        int left=0, right=0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            int fixed = nums[i];
            if(i==0 || nums[i-1]< nums[i]){
                left = i+1; right = nums.length-1;
            }
            while(left<right){
                value = nums[i]+nums[left]+nums[right];
                if(value > target) right--;
                else left++;
                if(Math.abs(value-target)<Math.abs(result-target)) result = value;
            }
        }
        return result;
    }
}
