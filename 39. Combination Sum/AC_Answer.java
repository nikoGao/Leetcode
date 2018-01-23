class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, result, new ArrayList<>(), 0, target);
        return result;
    }
    
    public void backtrack(int[] candidates, List<List<Integer>> result, List<Integer> container, int index, int target){
        if(target<0) return;
        else if(target==0) result.add(new ArrayList<>(container));
        else{
            for(int i=index; i<candidates.length; i++){
                container.add(candidates[i]);
                backtrack(candidates, result, container, i, target-candidates[i]);
                container.remove(container.size()-1);
            }
        }
    }
}
