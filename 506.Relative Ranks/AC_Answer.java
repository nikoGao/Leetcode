class Solution {
    public String[] findRelativeRanks(int[] nums) {
        String[] ranks = new String[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        Arrays.sort(nums); //the meaning is to keep the original index, then sort nums
        for(int i=nums.length-1; i>=0; i--){
            if(i==nums.length-1) ranks[map.get(nums[i])] = "Gold Medal";
            else if(i==nums.length-2) ranks[map.get(nums[i])] = "Silver Medal";
            else if(i==nums.length-3) ranks[map.get(nums[i])] = "Bronze Medal";
            else ranks[map.get(nums[i])] = new Integer(nums.length-i).toString();
        }
        return ranks;
    }
}
