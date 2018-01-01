class Solution {
    public boolean checkRecord(String s) {
        int count_A = 0;
        int count_L = 0;
        int max = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='A') count_A++;
            else if(s.charAt(i)=='L'){
                if(count_L==0) count_L++;
                else if(s.charAt(i-1)=='L') count_L++;
                else{
                    max = Math.max(max, count_L);
                    count_L = 1;
                }
            }
        }
        max = Math.max(max, count_L);
        return count_A<=1 && max<=2;
    }
}
