class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> presum = new HashMap<>();
        int sum = 0, result=0;
        presum.put(0, 1);
        // if k==0 , [] subarray will fit the requirement
        
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(presum.containsKey(sum-k)){
                // all # of SUM[0, i] fit the requirement
                result += presum.get(sum-k);
            }
            presum.put(sum, presum.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}
