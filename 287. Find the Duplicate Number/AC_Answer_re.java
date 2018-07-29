class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length<1) return -1;
        int slow = nums[0];
        int fast = nums[nums[0]];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]]; // two step before slow
        }
        // the fast and slow will meet at some point in the cycle, it's time to find out the start of the cycle
        fast = 0;
        while(slow != fast){
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;
    }
}
