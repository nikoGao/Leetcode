class Solution {
    public int[] constructArray(int n, int k) {
        int[] result = new int[n];
        if(k>=n) return result;
        // at most n-1 difference
        // when k=n-1, the pattern should be 1, n, 2, n-1, ....
        // when k<n-1, then just stop when k=1 and the rest should increment by 1
        // when k is even, we should insert n first, otherwise like 1, n, 2, 3 would be odd # of differences
        for(int i=0, s = 1, e=n; i<n; i++){
            result[i] = k>1 ? (k-- % 2!=0? s++: e--) : s++;
        }
        return result;
    }
}
