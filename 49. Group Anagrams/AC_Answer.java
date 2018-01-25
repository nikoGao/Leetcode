class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for(String s:strs){
            char[] cs = s.toCharArray();
            Arrays.sort(cs);
            String keystr = String.valueOf(cs);
            if(!result.containsKey(keystr)) result.put(keystr, new ArrayList<>());
            result.get(keystr).add(s);
        }
        return new ArrayList<List<String>>(result.values());
    }
}
