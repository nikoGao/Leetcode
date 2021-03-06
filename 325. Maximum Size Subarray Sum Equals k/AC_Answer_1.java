class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        // as the point is to find the maximum length, so if there is duplicate sum result, we keep it at the index of first meet to satisfy the maximum as i is continue increasing
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, max = 0;
        for(int i=0;i<nums.length; i++){
            sum += nums[i];
            if(sum==k) max = Math.max(max, i+1);
            else if(map.containsKey(sum-k)) max = Math.max(max, (i-map.get(sum-k)));
            if(!map.containsKey(sum)) map.put(sum, i);
        }
        return max;
    }
}
