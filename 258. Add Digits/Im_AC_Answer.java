//Use theory digit-root problem: dr[n] = 1 + (n-1)%9
class Solution {
    public int addDigits(int num) {
        return 1 + (num-1)%9;
    }
}