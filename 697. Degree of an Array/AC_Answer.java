class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer[]> map2 = new HashMap<>();
        int degree = 0;
        for(int i=0; i<nums.length; i++){
            int cur = nums[i];
            map.put(cur, map.getOrDefault(cur, 0)+1);
            degree = Math.max(degree, map.get(cur));
            if(map2.get(cur)==null) map2.put(cur, new Integer[2]);
            Integer[] numsRange = map2.get(cur);
            if(numsRange[0]==null) numsRange[0] = i;
            numsRange[1] = i;
        }
        int distance = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()==degree){
                distance = Math.min(map2.get(entry.getKey())[1]-map2.get(entry.getKey())[0]+1, distance);
            }
        }
        return distance;
    }
}
