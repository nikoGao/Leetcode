class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] chars = new int[256];
        for(int i=s.length()-1; i>=0; i--){
            // from back to start to avoid the inference of index 0 and initial 0
            // if the last appear index of current chars aren't equal, there is a mismatch
            if(chars[s.charAt(i)] != chars[t.charAt(i)+128]) return false;
            chars[s.charAt(i)] = chars[t.charAt(i)+128] = i;
        }
        return true;
    }
}
