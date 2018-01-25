class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permute = new ArrayList<>();
        backtrack(permute, nums, new ArrayList<>());
        return permute;
    }
    
    public void backtrack(List<List<Integer>> permute, int[] nums, List<Integer> list){
        if(list.size()==nums.length) permute.add(new ArrayList<>(list));
        else{
            for(int i=0; i<nums.length; i++){
                if(list.contains(nums[i])) continue;
                list.add(nums[i]);
                backtrack(permute, nums, list);
                list.remove(list.size()-1);
            }
        }
    }
}
