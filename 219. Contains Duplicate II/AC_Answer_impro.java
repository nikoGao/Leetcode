class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> indexes = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(indexes.containsKey(nums[i])){
                int diff = Math.abs(i-indexes.get(nums[i]));
                if(diff<=k) return true;
                else indexes.put(nums[i], i);
            }else indexes.put(nums[i], i);
        }
        return false;
    }
}
