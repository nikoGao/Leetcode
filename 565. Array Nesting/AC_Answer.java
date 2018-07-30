class Solution {
    public int arrayNesting(int[] nums) {
        int result = 0;
        if(nums.length==0) return result;
        for(int i=0; i<nums.length; i++){
            int size = 0;
            for(int k=i; nums[k]>=0; size++){
                int t = nums[k];
                nums[k] = -1;
                k = t;
            }
            result = Math.max(result, size);
        }
        return result;
    }
}
