class Solution {
    public char findTheDifference(String s, String t) {
        // like find the single int in an array of all integerw appear twice except one
        // can use bit manipulate
        int n = t.length();
        char result = t.charAt(n-1); // t's length is one longer than s
        for(int i=0; i<n-1; i++){
            result ^= s.charAt(i);
            result ^= t.charAt(i);
        }
        return result;
    }
}
