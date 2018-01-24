class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(candidates);
        combine(candidates, target, 0, new ArrayList<>(), result);
        List<List<Integer>> output = new ArrayList<>();
        for(List<Integer> i: result) output.add(i);
        return output;
    }
    public void combine(int[] candidates, int target, int index, List<Integer> can, Set<List<Integer>> result){
        if(target<0) return;
        else if(target==0){
            result.add(new ArrayList<>(can));
            return;
        }
        else{
            for(int i = index; i<candidates.length; i++){
                can.add(candidates[i]);
                combine(candidates, target-candidates[i], i+1, can, result);
                can.remove(can.size()-1);
            }
        }
    }
    
}
