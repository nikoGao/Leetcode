class RandomizedCollection {
    // for the run same probability of each element, need to use arraylist
    // so, to maintain O(1) average runtime for each function, especially the remove of arraylist
    // use a linked set to record each locs of element in arraylist, and use set & removelast function of arraylist
    private HashMap<Integer, Set<Integer>> locations;
    private ArrayList<Integer> nums;
    private Random rd = new Random();

    /** Initialize your data structure here. */
    public RandomizedCollection() {
        locations = new HashMap<>();
        nums = new ArrayList<>();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        boolean exist = locations.containsKey(val);
        if(!exist) locations.put(val, new LinkedHashSet<>());
        locations.get(val).add(nums.size());
        nums.add(val);
        return !exist;
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        boolean exist = locations.containsKey(val);
        if(!exist) return false;
        int loc = locations.get(val).iterator().next();
        locations.get(val).remove(loc);
        if(loc<nums.size()-1){
            int last = nums.get(nums.size()-1);
            // rewrite loc with last element
            nums.set(loc, last);
            // change the location in locations
            locations.get(last).remove(nums.size()-1);
            locations.get(last).add(loc);
        }
        // remove last element
        nums.remove(nums.size()-1);
        
        if(locations.get(val).isEmpty()) locations.remove(val);
        return true;
        
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        return nums.get(rd.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
