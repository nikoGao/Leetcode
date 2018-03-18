class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n==1) return Collections.singletonList(0);
        List<Set<Integer>> e = new ArrayList<>();
        for(int i=0; i<n; i++){
            e.add(new HashSet<>());
        }
        for(int[] ed: edges){
            e.get(ed[0]).add(ed[1]);
            e.get(ed[1]).add(ed[0]);
        }
        List<Integer> leaves = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(e.get(i).size()==1) leaves.add(i);
        }
        while(n>2){
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for(int i:leaves){
                int j = e.get(i).iterator().next();
                e.get(j).remove(i);
                if(e.get(j).size()==1) newLeaves.add(j);
            }
            leaves = newLeaves;
        }
        return leaves;
    }
}
