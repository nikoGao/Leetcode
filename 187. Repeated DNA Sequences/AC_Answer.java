class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> c = new HashMap<>();
        for(int i=0; i<=s.length()-10; i++){
            String sub = s.substring(i, i+10);
            if(c.containsKey(sub)) c.put(sub, c.get(sub)+1);
            else c.put(sub, 1);
        }
        for(String key: c.keySet()){
            if(c.get(key)>1) res.add(key);
        }
        return res;
    }
}
