class Solution {
    public boolean checkValidString(String s) {
        // this solution is an improvement of solution 1, it's finding rangeof the number of left bracket
        int low=0, hi=0;
        for(char c:s.toCharArray()){
            low += c=='('?1:-1; // treat sparkle as right bracket
            hi += c!=')'?1:-1; // treat sparkle as left bracket
            if(hi<0) return false; // parently there are more right than left
            low = Math.max(0, low);
        }
        return low == 0;
    }
}
