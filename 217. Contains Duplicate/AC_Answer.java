class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int length = nums.length;
        for(int i = 0; i<length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],0);
            }
        }
        return false;
    }
}
