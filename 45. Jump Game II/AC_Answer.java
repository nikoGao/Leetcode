class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1) return 0;
        int curMax = 0, i=0;
        int level = 0; // use bfs, make all elements can reach by previous specific element in the same level
        while(i<=curMax){
            int farthest = curMax; // mark the farthest index can be reached now
            for(; i<=curMax; i++){
                farthest = Math.max(farthest, nums[i] + i);
                if(farthest >= nums.length-1) return level+1; // can reach the last index
            }
            level++;
            curMax = farthest;
        }
        return -1;
    }
}
