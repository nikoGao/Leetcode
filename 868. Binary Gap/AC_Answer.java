class Solution {
    public int binaryGap(int N) {
        String s = Integer.toBinaryString(N);
        int first = -1, result = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                if(first == -1) first = i;
                else{
                    result = Math.max(i-first, result);
                    first = i;
                }
            }
        }
        return result;
    }
}
