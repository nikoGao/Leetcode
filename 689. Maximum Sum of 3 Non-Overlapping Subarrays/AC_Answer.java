class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int[] result = new int[3];
        int[] dp = new int[nums.length+1];
        for(int i=0; i<nums.length; i++) dp[i+1] = dp[i] + nums[i];
        int[] left = new int[nums.length], right = new int[nums.length];
        int max = 0, n = nums.length;
        // calculate left max subarray with length k
        for(int i=k, boundary = dp[k]-dp[0]; i<nums.length; i++){
            if(dp[i+1] - dp[i+1-k] > boundary){
                // the sum of [i+1-k, i+1) is greater now
                left[i] = i+1-k; // store the start index of current greater interval
                boundary = dp[i+1] - dp[i+1-k];
            }else{
                left[i] = left[i-1];
            }
        }
        
        // calculate right max
        right[n-k] = n-k; // the last k's start index must be n-k
        for(int i = n-k-1, boundary = dp[n]-dp[n-k]; i>=0; i--){
            if(dp[i+k]-dp[i]>=boundary){
                right[i] = i;
                boundary = dp[i+k]-dp[i];
            }else right[i] = right[i+1];
        }
        
        // calculate the middle
        for(int i=k; i<=n-2*k; i++){
            int posleft = left[i-1], posright = right[i+k];
            // as left and right store the start index of each interval
            int total = (dp[i+k]-dp[i]) + (dp[posleft+k] - dp[posleft]) + (dp[posright+k]- dp[posright]);
            // System.out.println(total);
            if(total>max){
                result[0] = posleft;
                result[1] = i;
                result[2] = posright;
                max = total;
            }
        }
        return result;
    }
}
