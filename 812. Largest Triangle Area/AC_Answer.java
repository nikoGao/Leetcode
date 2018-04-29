class Solution {
    public double largestTriangleArea(int[][] points) {
        // only can use brute force
        double res = 0.0;
        for(int[] x1:points){
            for(int[] x2:points){
                for(int[] x3: points){
                    res = Math.max(res, 0.5*(x3[0]*x1[1]+x2[0]*x3[1]+x1[0]*x2[1]-x1[0]*x3[1]-x2[0]*x1[1]-x3[0]*x2[1]));
                }
            }
        }
        return res;
    }
}
