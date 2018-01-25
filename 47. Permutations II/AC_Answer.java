class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> sets = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, sets, new ArrayList<>(), new ArrayList<>());
        for(List<Integer> i:sets) result.add(i);
        return result;
    }
    
    public void backtrack(int[] nums, Set<List<Integer>> sets, List<Integer> list, List<Integer> indexes){
        if(indexes.size()==nums.length) sets.add(new ArrayList<>(list));
        else{
            for(int i=0; i<nums.length; i++){
                if(indexes.contains(i)) continue;
                list.add(nums[i]);
                indexes.add(i);
                backtrack(nums, sets, list, indexes);
                list.remove(list.size()-1);
                indexes.remove(indexes.size()-1);
            }
        }
    }
}
