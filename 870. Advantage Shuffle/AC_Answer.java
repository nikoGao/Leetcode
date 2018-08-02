class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        Queue<int[]> BQ = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return b[0]-a[0];
            }
        });
        // first should satisfy the biggest number in B, so store the <value, index> pair in the descending order
        for(int i=0; i<B.length; i++) BQ.add(new int[]{B[i], i});
        int lo = 0, hi = A.length-1;
        int[] result = new int[hi+1];
        while(!BQ.isEmpty()){
            int[] b = BQ.poll();
            // if the biggest number of A can not satisfy current number, then use the smallest number to fill the blank
            if(A[hi]>b[0]) result[b[1]] = A[hi--];
            else result[b[1]] = A[lo++];
        }
        return result;
    }
}
