class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if(envelopes.length==0 || envelopes[0].length<2) return 0;
        Arrays.sort(envelopes, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0]==b[0]) return b[1]-a[1];
                else return a[0]-b[0];
            }
        });
        int[] result = new int[envelopes.length];
        int len = 0;
        for(int[] e:envelopes){
            int index = Arrays.binarySearch(result, 0, len, e[1]);
            if(index<0){
                // the index is where the new element should be insert
                index = -(index + 1);
            }
            result[index] = e[1];
            if(index==len) len++; // only when we need to insert in the back makes it a necessary increasing subarray
        }
        return len;
    }
}
