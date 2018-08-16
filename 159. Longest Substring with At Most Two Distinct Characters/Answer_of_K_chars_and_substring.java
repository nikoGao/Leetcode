class Solution{
	public String longestSubstringOfkDistinctChars(String s, int k){
		// when meet k distinct, we need map or array to track the occurrence of the number of distinct chars
		if(s == null || s.length() == 0) return 0;
        if(s.length() <= k) return s.length();
        
        int left = 0, right = 0;
        int maxLen = 0;
        int start = 0;
        Map<Character, Integer> charIndex = new HashMap<>();
        while(right < s.length()){
            if(charIndex.size() <= k){
                charIndex.put(s.charAt(right), right);
                right++;
            }
            if(charIndex.size() > k){
                int leftMost = s.length();
                for(int index : charIndex.values()){
                    leftMost = Math.min(leftMost, index);
                }
                char c = s.charAt(leftMost);
                charIndex.remove(c);
                left = leftMost + 1;
            }
            // maxLen = Math.max(maxLen, right - left);
            if(right - left > maxLen){
                start = left;
                maxLen = right - left;
            }
        }
        System.out.println(s.substring(start, start + maxLen));
        return maxLen;
	}
}