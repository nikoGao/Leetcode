class Solution {
    public int singleNumber(int[] nums) {
        //binary operation
        int one = 0, two = 0;
        for(int i: nums){
            one = (one ^ i) & ~two;
            two = (two ^ i) & ~one;
        }
        return one;
    }
}
