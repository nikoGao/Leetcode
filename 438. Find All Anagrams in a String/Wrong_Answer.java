// Time Limit Exceed
// Use about O(3*n)

class Solution {
    public boolean isAnagrams(String sub, String p){
        Map<Character, Integer> map= new HashMap<Character, Integer>();
        for(int i=0; i< p.length(); i++){
            if(map.containsKey(p.charAt(i))) map.put(p.charAt(i), map.get(p.charAt(i))+1);
            else map.put(p.charAt(i), 1);
            if(map.containsKey(sub.charAt(i))) map.put(sub.charAt(i), map.get(sub.charAt(i))-1);
            else map.put(sub.charAt(i), -1);
        }
        for(Character key: map.keySet()){
            if(map.get(key)!=0) return false;
        }
        return true;
    }
    
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        int length = p.length();
        if(s.length()<length) return res;
        for(int i=0; i< s.length()-length+1; i++){
            String substr = s.substring(i, i+length);
            if(isAnagrams(substr, p)) res.add(i);
        }
        return res;
    }
}
