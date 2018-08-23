class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.isEmpty()) return true;
        if(s.length()==1) return false;
        for(int i=0; i<s.length()/2; i++){
            String sub1 = s.substring(0, i+1);
            String sub2 = s.substring(s.length()-i-1);
            if(sub1.equals(sub2) && confirm(s, sub1)) return true; 
        }
        return false;
    }
    
    public boolean confirm(String s, String prefix){
        int i = 0, len = prefix.length();
        while(i<s.length()){
            if(i+len>s.length()) return false;
            if(!prefix.equals(s.substring(i, i+len))) return false;
            i = i+len;
        }
        return true;
    }
}
