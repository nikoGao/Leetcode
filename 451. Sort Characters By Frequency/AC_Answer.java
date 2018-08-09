class Solution {
    public String frequencySort(String s) {
        // similar with No.347
        Map<Character, Integer> frequency = new HashMap<>();
        for(char c:s.toCharArray()){
            frequency.put(c, frequency.getOrDefault(c, 0)+1);
        }
        List<Character>[] buckets = new List[s.length()+1];
        for(char c:frequency.keySet()){
            int freq = frequency.get(c);
            if(buckets[freq]==null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=buckets.length-1; i>=0; i--){
            if(buckets[i] != null){
                for(char c:buckets[i]){
                    for(int count =0; count<frequency.get(c); count++) sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
