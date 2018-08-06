class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0,j=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))) j = Math.max(j, map.get(s.charAt(i))+1); // find the index of duplicate letter
            map.put(s.charAt(i), i);
            result = Math.max(result, i-j+1); // i is the start of substring, j is end of substring
        }
        return result;
    }
}
