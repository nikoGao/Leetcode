// As 4 is the dead answer, we need to leave the multiple of 4 to the opponent. So if n is not the multiple of 4, we can always change it be to the multiple

class Solution {
    public boolean canWinNim(int n) {
        return n%4!=0;
    }
}
