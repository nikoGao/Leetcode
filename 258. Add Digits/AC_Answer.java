//O(n) time, not use digit root
class Solution {
    public int addDigits(int num) {
        int one_digit = num;
        while(one_digit>=10){
            int res = 0;
            while(one_digit!=0){
                res += one_digit%10;
                one_digit /= 10;
            }
            one_digit = res;
        }
        return one_digit;
    }
}