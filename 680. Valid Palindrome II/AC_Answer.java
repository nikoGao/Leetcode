class Solution {
    public boolean validPalindrome(String s) {
        int left = -1, right = s.length();
        while(++left<right--){
            if(s.charAt(left)!=s.charAt(right)) return isPalindrome(s, left, right+1) || isPalindrome(s, left-1, right);
        }
        return true;
    }
    
    public boolean isPalindrome(String s, int left, int right){
        while(++left < --right){
            if(s.charAt(left)!=s.charAt(right)) return false;
        }
        return true;
    }
}
