class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        Set<List<Integer>> combinations = new HashSet<>();
        findCombination(combinations, k, n, 1,new ArrayList<>());
        List<List<Integer>> res = new ArrayList<>(combinations);
        return res;
    }
    
    public void findCombination(Set<List<Integer>> comb, int k, int n, int start, List<Integer> c){
        if(n==0 && k==0) comb.add(new ArrayList<>(c));
        else{
            for(int i=start; i<10; i++){
                c.add(i);
                findCombination(comb, k-1, n-i, i+1,c);
                c.remove(c.size()-1);
            }
        }
    }
}
