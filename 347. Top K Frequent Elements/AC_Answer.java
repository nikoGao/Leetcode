class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        // Total O(n) time
        // firstly, use HashMap to count each element's frequency
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums) map.put(i, map.getOrDefault(i, 0)+1);
        
        // create list bucket, use frequecy as index
        List<Integer>[] frequencies = new List[nums.length+1];
        for(int key:map.keySet()){
            int f = map.get(key);
            if(frequencies[f]==null) frequencies[f] = new ArrayList<>();
            frequencies[f].add(key);
        }
        
        List<Integer> res = new ArrayList<>();
        
        for(int i=frequencies.length-1; i>0 && k>res.size(); i--){
            if(frequencies[i]!=null) res.addAll(frequencies[i]);
        }
        return res;
    }
}
