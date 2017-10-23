public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        int round = 1;
        while(round <= 32){
            res += n & 1;
            n>>=1;
            round++;
        }
        return res;
    }
}
