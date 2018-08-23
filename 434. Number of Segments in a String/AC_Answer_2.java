class Solution {
    public int countSegments(String s) {
        if(s.isEmpty()) return 0;
        int i=0, count = 0;
        for(int j=0; j<s.length(); j++){
            if(s.charAt(j)==' ' || j==s.length()-1){
                if(s.charAt(i) !=' '){
                    count++;
                }
                i = j+1;
            }
        }
        return count;
    }
}
