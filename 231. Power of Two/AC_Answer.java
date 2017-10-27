// since power of 2 only have one '1'
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && Integer.bitCount(n)==1;
    }
}
