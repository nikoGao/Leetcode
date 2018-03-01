class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int length = 0;
        if(nums.length==0) return length;
        int i=0, j=0, sum =0, min=Integer.MAX_VALUE;
        //window sliding with two points, to shorten the window by sum>=s
        while(j<nums.length){
            sum += nums[j++];
            while(sum >=s){
                min = Math.min(min, j-i);
                sum -= nums[i++];
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
