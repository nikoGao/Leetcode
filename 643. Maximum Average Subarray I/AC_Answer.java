class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, temp = 0;
        int q = 0;
        while(q<k){
            sum += nums[q++];
        }
        temp = sum;
        sum /= k;
        for(int i=1; i<nums.length-k+1; i++){
            temp = temp -nums[i-1] + nums[i+k-1];
            sum = Math.max(temp/k, sum);
        }
        return sum;
    }
}
