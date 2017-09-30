# Separate question to small dp question

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] A = new int[n];
        A[0] = nums[0];
        int max = A[0];
        for(int i = 1; i<n; i++){
            A[i] = nums[i] + (A[i-1] > 0? A[i-1]: 0);
            max = Math.max(max, A[i]);
        }
        return max;
    }
}
