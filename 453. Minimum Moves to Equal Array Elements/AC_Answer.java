//Math work: sum + m*(n-1) = k*n
// k is the min num of arrays
// so sum-minNum*n
class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int minNum = nums[0], sum = 0;
        for(int i=0; i< nums.length; i++){
            sum += nums[i];
        }
        return sum-minNum*nums.length;
    }
}
