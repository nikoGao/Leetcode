class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> appear = new HashMap<>();
        for(String word: words) appear.put(word, appear.getOrDefault(word, 0)+1);
        
        List<Integer> result = new ArrayList<>();
        if(s.length()==0 || words.length==0) return result;
        
        int n = s.length(), num = words.length, len = words[0].length();
        for(int i=0; i<n-num*len+1; i++){
            Map<String, Integer> found = new HashMap<>();
            int j = 0;
            while(j<num){
                String sub = s.substring(i+j*len, i+(j+1)*len);
                if(!appear.containsKey(sub)) break;
                else{
                    found.put(sub, found.getOrDefault(sub, 0)+1);
                    if(found.get(sub)>appear.get(sub)) break;
                }
                j++;
            }
            if(j==num) result.add(i);
        }
        return result;
    }
}
