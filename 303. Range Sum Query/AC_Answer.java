// record the sum when initializing array
class NumArray {
    List<Integer> arr;
    List<Integer> sum;
    public NumArray(int[] nums) {
        arr = new ArrayList<Integer>();
        sum = new ArrayList<Integer>();
        sum.add(0);
        for(int i=0; i< nums.length; i++){
            arr.add(nums[i]);
            sum.add(sum.get(i)+nums[i]);
        }
    }
    
    public int sumRange(int i, int j) {
        int res = sum.get(j+1)-sum.get(i);
        return res;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
