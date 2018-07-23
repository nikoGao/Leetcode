class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int low1 = 0, peek = 0, low2 = 0;
        for(int i=0; i<A.length-2; i++){
            low1 = A[i];
            peek = A[i+1];
            low2 = A[i+2];
            if(low1<peek && peek > low2) return i+1;
        }
        return -1;
    }
}
