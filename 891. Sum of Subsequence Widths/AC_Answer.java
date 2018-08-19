class Solution {
    public int sumSubseqWidths(int[] A) {
        /**
        The basic thought is: after sorted,
        For index A[i],
        there are 2^i subarrays where A[i] is the max,
        so sum += A[i]*2^i
        there are also 2^(n-i-1) subarrays where A[i] is the min,
        so sum -= A[i]*2(n-i-1)
        So for each 2^i, we need to add A[i]*2^i and we need to substract A[n-i-1]*2^i
        */
        long modulo = (long)1e9 + 7;
        Arrays.sort(A);
        if(A.length==0) return 0;
        long c = 1, res = 0;
        for(int i=0; i<A.length; i++, c = (c<<1) % modulo){
            res = (res + A[i]*c - A[A.length-1-i]*c) % modulo;
        }
        return (int)((res+modulo) % modulo);
    }
}
