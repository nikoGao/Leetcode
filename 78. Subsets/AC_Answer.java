class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<=nums.length; i++){
            addSubsets(res, nums, i, 0, new ArrayList<>());
        }
        return res;
    }
    
    public void addSubsets(List<List<Integer>> res, int[] nums, int length, int index, List<Integer> c){
        if(length==0){
            res.add(new ArrayList<>(c));
            return;
        }else{
            for(int i=index; i<nums.length; i++){
                c.add(nums[i]);
                addSubsets(res, nums, length-1, i+1, c);
                c.remove(c.size()-1);
            }
        }
    }
}
