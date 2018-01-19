class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int length = 1, count = 1;
        int i = 0, j = 1;
        while(j<s.length()){
            String sub = s.substring(i, i+count);
            if(sub.indexOf(s.charAt(j))>=0){
                i++;
                length = Math.max(length, count);
                count = 1;
                j = i+1;
            }else{
                count++;
                j++;
            }
        }
        length = Math.max(length, count);
        return length;
    }
}
