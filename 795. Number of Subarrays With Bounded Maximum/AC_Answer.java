class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        // need to calculate the distance between the elements in the range of [L, R] and the begin till meet any element > R
        int res=0, i=0, count=0;
        for(int j=0; j<A.length; j++){
            if(A[j]>=L && A[j]<=R){
                res += j-i+1;
                count = j-i+1;
            }else if(A[j]<L) res += count;
            else{
                i = j+1;
                count = 0;
            }
        }
        return res;
    }
}
