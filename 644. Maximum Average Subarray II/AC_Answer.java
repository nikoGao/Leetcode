class Solution {
    // check runtime O(n), the binary search O(log(20000)), so total O(nlog(20000))
    
    public boolean check(int[] nums, int k, double result){
        double[] diffs = new double[nums.length];
        for(int i=0; i<nums.length; i++) diffs[i] = nums[i]-result;
        
        double current = 0, previous = 0;
        for(int i=0; i<k; i++) current += diffs[i];
        if(current>=0) return true; // first k-length subarray's average will greater or equal than result
        for(int i=k; i<nums.length; i++){
            current += diffs[i];
            previous += diffs[i-k];
            if(previous<0){
                // remove all <0 part to make sum greater
                current -= previous;
                previous = 0;
            }
            if(current>=0) return true; // first k-length subarray's average will greater or equal than result
        }
        return false;
    }
    
    public double findMaxAverage(int[] nums, int k) {
        /**
        view this problem as finding a maximum average exists in nums with length k,
        the binary search is not on the nums, instead doing binary on all double 
        */
        double min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        while(max-min>0.000005){
            double mid = (min+max)/2;
            if(check(nums, k, mid)) min = mid;
            else max = mid;
        }
        return max;
    }
}
