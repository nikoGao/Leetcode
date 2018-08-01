class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            // just to check whether current element is in the set length k
            if(i>k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true; // means there is already one same element in the set, fit the requirment
        }
        return false;
    }
}
