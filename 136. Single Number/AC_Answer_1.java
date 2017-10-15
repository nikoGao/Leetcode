//Use bit manipulation, XOR, because other elems all appear twice, their XOR would be 0

class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0;i<nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }
}
