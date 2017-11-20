class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            int val = Math.abs(nums[i])-1;
            if(nums[val]>0)
                nums[val] = -nums[val];
        }
        for(int j =0; j< nums.length; j++){
            if(nums[j]>0)
                res.add(j+1);
        }
        return res;
    }
}
