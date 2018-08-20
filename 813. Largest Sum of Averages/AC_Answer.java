class Solution {
    public double largestSumOfAverages(int[] A, int K) {
        if(K>A.length) return 0.0;
        int N = A.length;
        // represent index i(start with 1) in Kth group(also start with 1, the largest k is N)
        double[][] record = new double[N+1][N+1];
        double sum = 0;
        for(int i=0; i<N; i++){
            // current index is the end of group 1
            sum += A[i];
            record[i+1][1] = sum/(i+1);
        }
        return split(record, K, A, N);
    }
    
    public double split(double[][] record, int k, int[] A, int n){
        if(record[n][k]>0) return record[n][k];
        if(n<k) return 0;
        double sum = 0;
        for(int i=n-1; i>0; i--){
            // current index is the end of group k
            sum += A[i];
            record[n][k] = Math.max(record[n][k], split(record, k-1, A, i) + sum / (n-i));
        }
        return record[n][k];
    }
}
