//Time complexity O(logn)

class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1, end = num;
        while(start<=end){
            long mid = (start+end)/2;
            if(mid*mid==num) return true;
            else if(mid*mid>num) end = (int)mid-1;
            else start = (int)mid+1;
        }
        return false;
    }
}
