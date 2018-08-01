// If use HashSet, it will TLE as the add time complexity is O(n)
// Then use map instead of two sets, pay attention to the situtation of value=2*n
class TwoSum {

    private HashMap<Integer, Integer> nums;
    /** Initialize your data structure here. */
    public TwoSum() {
        nums = new HashMap<>();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        nums.put(number, nums.getOrDefault(number, 0)+1);
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for(Integer n:nums.keySet()){
            if(nums.containsKey(value-n)){
                if(value-n != n || nums.get(n)>=2) return true;
            }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */
