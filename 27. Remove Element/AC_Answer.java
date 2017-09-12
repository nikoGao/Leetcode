// Don't need to worry about nums[i]==val, just change it with previous !=val number;
// Runtime 9ms
class Solution {
    public int removeElement(int[] nums, int val) {
        int prev = 0;
        for(int i=0; i< nums.length; i++){
            if (nums[i] != val){
                nums[prev++] = nums[i];
            }
        }
        return prev;
    }
}
