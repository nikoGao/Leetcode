class Solution {
    public String rearrangeString(String s, int k) {
        // first solution: use two arrays
        /**
        the thought is : use one array/map to track the count of each chars, so we can always choose the one with greatest freq
        then, then next array to track the left most valid position of a char
        As only contains lowercase, we can use array[26], otherwise, we can use array[52] or map
        */
        int[] freq = new int[26];
        int[] validation = new int[26];
        for(char c:s.toCharArray()) freq[c-'a']++;
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<length; i++){
            int desire = checkValid(freq, validation, i);
            if(desire==-1) return "";
            freq[desire]--;
            validation[desire] = i + k; // next can appear position
            sb.append((char)('a'+desire));
        }
        return sb.toString();
    }
    
    public int checkValid(int[] freq, int[] valid, int index){
        // find the character with most frequecy and valid index
        int max = Integer.MIN_VALUE;
        int charIndex = -1;
        for(int i=0; i<freq.length; i++){
            // three conditions: must appear in original string; must in the valid position; must have the greatest frequency
            if(freq[i]>max && index>=valid[i] && freq[i]>0){
                max = freq[i];
                charIndex = i;
            }
        }
        return charIndex;
    }
}
