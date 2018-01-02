class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0) return m*n;
        int max = Integer.MAX_VALUE;
        int a_min = Integer.MAX_VALUE, b_min = Integer.MAX_VALUE;
        for(int[] op:ops){
            int a= op[0];
            int b= op[1];
            a_min = Math.min(a, a_min);
            b_min = Math.min(b, b_min);
        }
        return a_min*b_min;
    }
}
