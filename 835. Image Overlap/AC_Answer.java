class Solution {
    public int largestOverlap(int[][] A, int[][] B) {
        int N = A.length;
        List<Integer> LA = new ArrayList<>();
        List<Integer> LB = new ArrayList<>();
        Map<Integer, Integer> overlaps = new HashMap<>();
        for(int i=0; i<N*N; i++) if(A[i/N][i%N]==1) LA.add(i/N*60+i%N);
        for(int i=0; i<N*N; i++) if(B[i/N][i%N]==1) LB.add(i/N*60+i%N);
        // move A, find all overlaps 
        for(int i:LA){
            for(int j:LB) overlaps.put(i-j, overlaps.getOrDefault(i-j, 0)+1);
        }
        int result = 0;
        for(int v:overlaps.values()) result = Math.max(result, v);
        return result;
    }
}
