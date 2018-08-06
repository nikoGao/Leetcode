// use Map with one pointer, but slower
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0, start = 0;
        Map<Character, Integer> map = new HashMap<>();
        int i=0;
        while(i<s.length()){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                result = Math.max(result, i-start);
                start = map.get(c)+1;
                i = map.get(c)+1;
                map.clear();
            }else{
                map.put(c, i);
                i++;
                if(i==s.length()) result = Math.max(result, i-start);
            }
        }
        return result;
    }
}
