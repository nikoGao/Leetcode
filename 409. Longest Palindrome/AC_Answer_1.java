class Solution {
    public int longestPalindrome(String s) {
        // all even frequency letters with the odd frequency -1, if there is odd, add 1 to result at last
        int[] letters = new int[52];
        for(char c:s.toCharArray()){
            if(c<='Z') letters[c-'A']++;
            else letters[c-'a'+26]++;
        }
        int result = 0;
        boolean odd = false;
        for(int n:letters){
            if(n%2==1){
                result += n-1;
                odd = true;
            }
            else result += n;
        }
        return odd?result+1:result;
    }
}
