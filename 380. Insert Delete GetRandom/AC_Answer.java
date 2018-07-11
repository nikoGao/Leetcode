// the key point is to know the run time of each function
class RandomizedSet {

    List<Integer> sets;
    HashMap<Integer, Integer> locs;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        sets = new ArrayList<>();
        locs = new HashMap<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(locs.containsKey(val)) return false; // list contains() run in O(n), but map containsKey run in O(1)
        else{
            locs.put(val, sets.size());
            sets.add(val); // O(1) time
        }
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!locs.containsKey(val)) return false;
        else{
            int location = locs.get(val);
            if(location<sets.size()-1){
                int loc = sets.get(sets.size()-1);
                sets.set(locs.get(val), loc);
                locs.put(loc, locs.get(val));
            }
            locs.remove(val);
            sets.remove(sets.size()-1); // if just use remove to remove element in a list, it's average would be O(n), but if move the last one, it consumes only O(1)
        } 
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random rand = new Random();
        int index = rand.nextInt(sets.size());
        return sets.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
