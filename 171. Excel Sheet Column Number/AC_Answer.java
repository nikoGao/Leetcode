class Solution {
    public int titleToNumber(String s) {
        int length = s.length();
        int res = 0;
        for(int i=0; i< length; i++){
            res += Math.pow(26, length-1-i)*(s.charAt(i)-64);
        }
        return res;
    }
}
