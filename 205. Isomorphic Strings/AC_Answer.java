class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        Map<Character, Character> map2 = new HashMap<Character, Character>();
        if(s.length() != t.length()) return false;
        int len = s.length();
        int i = 0;
        while(i<len){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)) return false;
            }else{
                map.put(s.charAt(i), t.charAt(i));
            }
            if(map2.containsKey(t.charAt(i))){
                if(map2.get(t.charAt(i))!=s.charAt(i)) return false;
            }else{
                map2.put(t.charAt(i), s.charAt(i));
            }
            i++;
        }
        return true;
    }
}
