/*
(a) xxx011 (if yyy==xxx)
(b) less than xxx011 (if yyy==xxx)
(c) yyyzzz (if yyy<xxx)
for case (a), and (b), xxx011 will always be ANDed to the result, which results in xxx011 & xxx100 = uuu000(uuu == yyy&xxx == xxx);

for case ©, xxx000/xxx011 will always be ANDed to the result, which results in yyyzzz & xxx000 & xxx011 & xxx100 = uuu000 (uuu <= yyy & xxx)
*/
class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        if(m==0) return 0;
        int move = 1;
        while(m != n){
            m >>= 1;
            n >>=1;
            move <<=1;
        }
        return m*move;
    }
}
