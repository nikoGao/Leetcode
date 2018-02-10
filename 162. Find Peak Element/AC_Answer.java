class Solution {
    public int findPeakElement(int[] nums) {
        int prev = 0, cur = 0, next = 0;
        while(cur < nums.length-1){
            if(cur-1>0) prev = cur-1;
            next = cur+1;
            if(prev == 0 && nums[next] < nums[cur]) return cur;
            if(nums[prev] < nums[cur] && nums[next] < nums[cur]) return cur;
            cur++;
        }
        return cur;
    }
}
