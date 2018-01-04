class Solution {
    public boolean judgeSquareSum(int c) {
        if(c<0) return false;
        int left=0, right = (int)Math.sqrt(c)+1;
        while(left<=right){
            int output = left*left + right*right;
            if(output==c) return true;
            else if(output>c) right--;
            else left++;
        }
        return false;
    }
}
