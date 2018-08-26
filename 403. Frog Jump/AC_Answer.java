class Solution {
    public boolean canCross(int[] stones) {
        if(stones.length==0) return true;
        Map<Integer, Set<Integer>> steps = new HashMap<>();
        steps.put(0, new HashSet<>());
        steps.get(0).add(1);
        // need to start 0 with 1
        for(int i=1; i<stones.length; i++) steps.put(stones[i], new HashSet<>());
        for(int i=0; i<stones.length; i++){
            int s = stones[i];
            for(int step: steps.get(s)){
                int next = s+step;
                if(next==stones[stones.length-1]) return true;
                if(steps.containsKey(next)){
                    steps.get(next).add(step);
                    if(step-1>0) steps.get(next).add(step-1);
                    steps.get(next).add(step+1);
                }
            }
        }
        return false;
    }
}
