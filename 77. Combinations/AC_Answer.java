class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        findCombination(res, n, k, 1, new ArrayList<>());
        return res;
    }
    
    public void findCombination(List<List<Integer>> res, int n, int k, int index, List<Integer> container){
        if(k==0){
            res.add(new ArrayList<>(container));
            return;
        }else{
            for(int i=index; i<=n; i++){
                if(container.contains(i)) continue;
                container.add(i);
                findCombination(res, n, k-1, i+1, container);
                container.remove(container.size()-1);
            }
        }
        
    }
}
