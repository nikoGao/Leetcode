class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        return helper(s1, s2, s3, 0, 0, 0);
    }
    
    public boolean helper(String s1, String s2, String s3, int i1, int i2, int i3){
        if(s1.length() + s2.length() != s3.length()) return false;
        if(s1.isEmpty() && (s2.equals(s3))) return true;
        else if(s2.isEmpty() && (s1.equals(s3))) return true;
        else if(s1.isEmpty() || s2.isEmpty()) return false;
        
        int i=i1, j = i2, k = i3;
        while(i<s1.length() || j<s2.length()){
            if(i<s1.length() && s1.charAt(i)==s3.charAt(k) && j<s2.length() && s2.charAt(j)==s3.charAt(k)){
                // System.out.println("move 1 or 2");
                return helper(s1, s2, s3, i+1, j, k+1) || helper(s1, s2, s3, i, j+1, k+1);
            }else if(i<s1.length() && s1.charAt(i)==s3.charAt(k)){
                // System.out.println("move 1");
                i++;
                k++;
            }else if(j<s2.length() && s2.charAt(j)==s3.charAt(k)){
                // System.out.println("move 2");
                j++;
                k++;
            }else return false;
        }
        return k==s3.length();
    }
}
