class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        return dfs(s, wordDict, new HashMap<>());
    }
    
    public List<String> dfs(String s, List<String> wordDict, Map<String, List<String>> map){
        if(map.containsKey(s)) return map.get(s);
        List<String> result = new LinkedList<>();
        if(s.isEmpty()){
            result.add("");
            return result;
        }
        for(String word:wordDict){
            if(s.startsWith(word)){
                List<String> subsets = dfs(s.substring(word.length()), wordDict, map);
                for(String sub:subsets){
                    result.add(word + (sub.length()==0?"" :" ") + sub);
                }
            }
        }
        map.put(s, result);
        return result;
    }
}
