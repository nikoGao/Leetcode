class Solution {
    public String minWindow(String s, String t) {
        // total O(N) time
        if(s.length()==0 || t.length()==0 || s.length()<t.length()) return "";
        int[] dict = new int[128];
        // store all chars in t
        for(char c:t.toCharArray()) dict[c]++;
        
        int m = s.length(), n = t.length(), left = 0, low = 0, count = 0;
        int minLength = m + 1;
        // use hi as end of window
        for(int hi =0; hi<m; hi++){
            char c = s.charAt(hi);
            dict[c]--;
            // to count current number of found chars in s
            if(dict[c]>=0) count++;
            // while current length of substring has all chars we need
            while(count==n){
                if(minLength > hi-low+1){
                    minLength = hi - low + 1;
                    left = low;
                }
                // can move out all chars we don't need
                char c2 = s.charAt(low);
                dict[c2]++;
                if(dict[c2]>0) count--;
                low++;
            }
        }
        return minLength==m+1?"":s.substring(left, left+minLength);
    }
}
