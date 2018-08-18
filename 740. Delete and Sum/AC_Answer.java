class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = 10001;
        int[] values = new int[n];
        for(int num:nums) values[num] +=num;
        
        int skip = 0, delete = 0;
        for(int i=1; i<n ; i++){
            // already in order, i is actually nums[i]
            // skip[i] = Math.max(skip[i-1], delete[i-1]);
            int tskip = Math.max(skip, delete);
            // delete[i] = values[i] + skip[i-1]
            delete = values[i] + skip;
            skip = tskip;
        }
        return Math.max(skip, delete);
    }
}
