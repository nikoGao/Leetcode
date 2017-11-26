class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, temp=0;
        for(int num:nums){
            count = Math.max(count, temp=num==0?0:temp+1);
        }
        return count;
    }
}
