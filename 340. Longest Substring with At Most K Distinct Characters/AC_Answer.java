class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // the similar question of 159
        // use HashMap to record the last occurrence of each chars, always delete the char with the most left index
        if(s.length()<=k) return s.length();
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, start = 0, maxLength = 0, right = 0;
        while(right<s.length()){
            char c = s.charAt(right);
            if(map.size()<=k){
                map.put(c, right);
                right++;
            }
            if(map.size()>k){
                int leftMost = s.length();
                for(int i:map.values()){
                    leftMost = Math.min(leftMost, i);
                }
                char found = s.charAt(leftMost);
                map.remove(found);
                left = leftMost+1;
            }
            // this section will be proceeded in each turn
            if(right-left>maxLength){
                start = left;
                maxLength = right-left;
            }
        }
        return maxLength;
    }
}
