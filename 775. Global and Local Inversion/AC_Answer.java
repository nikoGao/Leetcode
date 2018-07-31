class Solution {
    public boolean isIdealPermutation(int[] A) {
        // all local inversion is global inversion, so the key is to find global inversion except all local ones
        // if A[i]>i+1, then means at least two value smaller than A[i] is kicked off from previous
        // e.g A[i] = 3, i=1, means 1, 2(or 0, 1 or 0, 1 or all of 0, 1, 2) is behind 3
        // then there must be one is two index away from i
        
        if(A.length==0) return true;
        for(int i=0; i<A.length; i++){
            if(Math.abs(A[i]-i)>1) return false;
        }
        return true;
    }
}
