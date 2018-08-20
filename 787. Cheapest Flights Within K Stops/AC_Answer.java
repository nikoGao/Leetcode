class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        // firstly, use Map<Map> to store (src->dst->price) associations
        Map<Integer, Map<Integer, Integer>> schedules = new HashMap<>();
        for(int[] f:flights){
            if(!schedules.containsKey(f[0])) schedules.put(f[0], new HashMap<>());
            schedules.get(f[0]).put(f[1], f[2]);
        }
        
        // secondly, build a priorityQueue, sorted by price
        PriorityQueue<int[]> q = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });
        // add the src, it's price and stops number
        q.offer(new int[]{0, src, K+1});
        while(!q.isEmpty()){
            int[] airline = q.poll();
            int price = airline[0];
            int source = airline[1];
            int stopN = airline[2];
            if(source==dst) return price;
            if(stopN>0){
                // get all cities can reach through source, push them into our queue
                Map<Integer, Integer> intermediate = schedules.getOrDefault(source, new HashMap<>());
                for(int key:intermediate.keySet()) q.offer(new int[]{price + intermediate.get(key), key, stopN-1});
            }
        }
        // if after search all nodes can reach by src, we doesn't find a path to dst
        return -1;
    }
}
