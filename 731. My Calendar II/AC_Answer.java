class MyCalendarTwo {
    
    private ArrayList<int[]> books;
    // private MyCalendarOne already_books;

    public MyCalendarTwo() {
        
        books = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        MyCalendarOne already_books = new MyCalendarOne();
        for(int[] b:books){
            // check with current books, to see if there is an overlap
            if(Math.max(b[0], start)<Math.min(b[1], end)){
                if(!already_books.book(Math.max(b[0], start), Math.min(b[1], end))) return false;
            }
        }
        books.add(new int[]{start, end});
        return true;
    }
    
    private static class MyCalendarOne{
        List<int[]> overlaps = new ArrayList<>(); // to store overlaps
        public boolean book(int start, int end){
            for(int[] o:overlaps){
                // check if there is a triple overlaps
                if(Math.max(o[0], start)<Math.min(o[1], end)) return false;
            }
            
            overlaps.add(new int[]{start, end});
            return true;
        }
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */
