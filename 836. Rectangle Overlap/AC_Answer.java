class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int A1 = rec1[0], A2 = rec1[2], A3 = rec2[0], A4 = rec2[2];
        int B1 = rec1[1], B2 = rec1[3], B3 = rec2[1], B4 = rec2[3];
        if((A3>=A1 && A3<A2 && ((B3>=B1 && B3<B2)||(B1>=B3 && B1<B4))) || (A1>=A3 && A1<A4 && ((B3>=B1 && B3<B2)||(B1>=B3 && B1<B4)))) return true;
        else return false;
    }
}
