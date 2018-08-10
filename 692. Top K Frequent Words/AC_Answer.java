class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> dict = new HashMap<>();
        List<String> result = new ArrayList<>();
        if(k==0 || words.length==0) return result;
        int max = 0;
        for(String w:words){
            dict.put(w, dict.getOrDefault(w, 0)+1); 
            max = Math.max(max, dict.get(w));
        }
        List<String>[] buckets = new List[max+1];
        for(String s:dict.keySet()){
            int freq = dict.get(s);
            if(buckets[freq]==null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(s);
        }
        while(result.size()<k){
            if(buckets[max]!=null){
                Collections.sort(buckets[max]);
                if(buckets[max].size()+result.size()<=k) result.addAll(buckets[max]);
                else{
                    for(int i=0; i<buckets[max].size() && result.size()<k; i++) result.add(buckets[max].get(i));
                }
            }
            max--;
        }
        return result;
    }
}
