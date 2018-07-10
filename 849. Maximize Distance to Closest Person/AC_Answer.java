class Solution {
    public int maxDistToClosest(int[] seats) {
        int res = 0, i, j, zero, n = seats.length;
        for(j=n-1, zero=0; seats[j]==0; j--) res = Math.max(res, ++zero);
        for(i=0, zero=0; seats[i]==0; i++) res = Math.max(res, ++zero);
        for(;i<j; i++){ 
            if(seats[i]==1) zero = 0; 
            else res = Math.max(res, (++zero+1)/2);
        }
        return res;
    }
}
