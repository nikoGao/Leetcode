// Time 13ms, length 18 lines
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length<=1) return nums.length;
        int j = 0;
        int prev = nums[j];
        int count = 1;
        for(int i=1; i< nums.length; i++){
            int cur = nums[i];
            if(cur != prev){
                count++;
                prev = cur;
                j++;
                nums[j] = nums[i];
            }
        }
        return (Arrays.copyOfRange(nums, 0, count)).length;
    }
}
