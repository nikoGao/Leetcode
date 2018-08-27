class Solution {
    public int splitArray(int[] nums, int m) {
        int max = 0;
        long sum = 0;
        for(int n:nums){
            max = Math.max(max, n);
            sum += n;
        }
        if(m==1) return (int)sum;
        long left = max;
        long right = sum;
        while(left<right){
            long mid = (left+right)/2;
            if(exist(mid, nums, m)) left = mid+1; // there are more than m subarrays have largest sum smaller than mid
            else right = mid; // there are no more than m subarrays have largest sum smaller than mid
        }
        return (int)left;
    }
    
    public boolean exist(long middle, int[] nums, int m){
        int count = 0;
        long sum = 0;
        for(int n:nums){
            sum += n;
            if(sum>middle){
                sum = n;
                count++;
                if(count>=m) return true;
            }
        }
        return false;
    }
}
