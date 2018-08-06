class MyHashSet {
    
    private int[][] tables;
    private int division = 1000;

    /** Initialize your data structure here. */
    public MyHashSet() {
        tables = new int[1000][1000];
    }
    
    public void add(int key) {
        tables[key/division][key%division]++;
    }
    
    public void remove(int key) {
        tables[key/division][key%division] = 0;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(tables[key/division][key%division]>0) return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
