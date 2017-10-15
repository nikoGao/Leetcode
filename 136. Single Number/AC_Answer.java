// absolutely not the best, since use two iteration

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        if(nums.length==1) return nums[0];
        while(i < nums.length-1){
            if(nums[i+1] == nums[i]) i+=2;
            else return nums[i];
        }
        return nums[i];
    }
}
