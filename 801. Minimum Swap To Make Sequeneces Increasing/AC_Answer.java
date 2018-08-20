class Solution {
    public int minSwap(int[] A, int[] B) {
        int[] swap = new int[A.length];
        int[] fix = new int[A.length];
        swap[0] = 1;
        fix[0] = 0;
        for(int i=1; i<A.length; i++){
            if(A[i]<=A[i-1] || B[i]<=B[i-1]){
                // disorder, current operation should be opposite of previous one
                fix[i] = swap[i-1];
                swap[i] = fix[i-1] + 1;
            }else if(B[i]<=A[i-1] || A[i]<=B[i-1]){
                // to keep ascending order, if previous operation is swap, currrent should also swap
                swap[i] = swap[i-1] + 1;
                fix[i] = fix[i-1];
            }else{
                // continue find the min
                int min = Math.min(swap[i-1], fix[i-1]);
                swap[i] = min + 1;
                fix[i] = min;
            }
        }
        return Math.min(swap[A.length-1], fix[A.length-1]);
    }
}
