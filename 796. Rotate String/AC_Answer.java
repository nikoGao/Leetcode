class Solution {
    public boolean rotateString(String A, String B) {
        int Alength = A.length();
        if(A.equals(B)) return true;
        else{
            for(int i=1; i<Alength; i++){
                if(A.charAt(i)==B.charAt(0)){
                    String s = A.substring(i) + A.substring(0, i);
                    if(s.equals(B)) return true;
                }
            }
            return false;
        }
    }
}
