class Solution {
    public boolean isReflected(int[][] points) {
        if(points.length==0) return true;
        int min = points[0][0], max = points[0][0];
        Set<String> pairs = new HashSet<>();
        for(int[] point:points){
            min = Math.min(point[0], min);
            max = Math.max(point[0], max);
            pairs.add(Integer.toString(point[0])+"*"+Integer.toString(point[1]));
        }
        int parallel = max+min;
        for(int[] point:points){
            int reflect = (parallel - point[0]);
            String reflection = Integer.toString(reflect)+"*"+Integer.toString(point[1]);
            if(!pairs.contains(reflection)) return false;
            
        }
        return true;
    }
}
