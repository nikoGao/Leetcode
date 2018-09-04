class Solution {
    public boolean checkValidString(String s) {
        // first one, left-right treat * as (, right-left treat * as )
        int parenthese = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='*') parenthese++;
            else parenthese--;
            if(parenthese<0) return false;
        }
        if(parenthese==0) return true;
        parenthese = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==')' || s.charAt(i)=='*') parenthese++;
            else parenthese--;
            if(parenthese<0) return false;
        }
        // we can treat some * as empty
        return true;
    }
}
