class Solution {
    public int numberOfBoomerangs(int[][] points) {
        if(points.length==0||points[0].length==0) return 0;
        int ret = 0;
        for(int i=0;i<points.length; i++){
            Map<Integer, Set<int[]>> map= new HashMap<>();
            int[] p=points[i];
            for(int j=0; j< points.length; j++){
                if(i==j) continue;
                int[] q=points[j];
                int dis = (q[0]-p[0])*(q[0]-p[0])+(q[1]-p[1])*(q[1]-p[1]);
                if(!map.containsKey(dis)) map.put(dis, new HashSet<int[]>());
                map.get(dis).add(q);
            }
            for(Integer key:map.keySet()){
                int size = map.get(key).size();
                if(size>=2) ret += (size*(size-1));
            }
        }
        return ret;
        
    }
}
