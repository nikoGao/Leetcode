class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length==1) return 0;
        Map<Integer, Integer> index = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            index.put(nums[i],i);
        }
        Arrays.sort(nums);
        if(nums[nums.length-1]>=2*nums[nums.length-2]) return index.get(nums[nums.length-1]);
        return -1;
    }
}
