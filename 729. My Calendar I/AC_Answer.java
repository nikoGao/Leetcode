class MyCalendar {
    TreeMap<Integer, Integer> calendar;

    public MyCalendar() {
        // use treemap to make start:end pair in the order of start
        calendar = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        // no need to traverse all key, just to find the key nearby start & end, if it fits the floor and ceiling, it fits all pairs inside this range
        Integer ceilkey = calendar.ceilingKey(start);
        Integer flooringkey = calendar.floorKey(start);
        
        // start in a range of existed interval, as floorkey already < start
        if(flooringkey!=null && start<calendar.get(flooringkey)) return false;
        // end in a range of existed interval, as start already < ceilkey
        if(ceilkey!=null && ceilkey < end) return false;
        calendar.put(start, end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
