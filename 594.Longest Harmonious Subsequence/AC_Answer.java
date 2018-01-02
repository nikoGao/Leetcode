class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        Map<Long, Integer> map = new HashMap<>();
        for(long i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int diff = 0;
        for(Long i:map.keySet()){
            if(map.containsKey(i+1)){
                diff = Math.max(map.get(i)+map.get(i+1), diff);
            }
        }
        return diff;
    }
}
