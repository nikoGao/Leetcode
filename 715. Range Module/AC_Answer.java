class RangeModule {
    
    private TreeMap<Integer, Integer> intervals;

    public RangeModule() {
        intervals = new TreeMap<>();
    }
    
    public void addRange(int left, int right) {
        // consider the situation of need to merge
        Integer floor = intervals.floorKey(left);
        Integer top = intervals.floorKey(right);
        if(floor!=null && intervals.get(floor)>=left) left = floor;
        if(top!=null && intervals.get(top)>right) right = intervals.get(top);
        intervals.put(left, right);
        // then we need to remove all (left, right] in the map
        intervals.subMap(left, false, right, true).clear();
    }
    
    public boolean queryRange(int left, int right) {
        Integer floor = intervals.floorKey(left);
        if(floor==null) return false;
        return intervals.get(floor)>=right;
    }
    
    public void removeRange(int left, int right) {
        // consider separate the interval
        Integer floor = intervals.floorKey(left);
        Integer top = intervals.floorKey(right);
        if(top!=null && intervals.get(top)>right){
            intervals.put(right, intervals.get(top));
        }
        if(floor!=null && left<intervals.get(floor)){
            intervals.put(floor, left);
        }
        intervals.subMap(left, true, right, false).clear();
    }
}

/**
 * Your RangeModule object will be instantiated and called as such:
 * RangeModule obj = new RangeModule();
 * obj.addRange(left,right);
 * boolean param_2 = obj.queryRange(left,right);
 * obj.removeRange(left,right);
 */
