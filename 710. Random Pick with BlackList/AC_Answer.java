class Solution {
    // find a way to redirect black number to other number and at the same time, keep the probability no-change
    
    private int actual = 0;
    private Random r;
    private HashMap<Integer, Integer> black2white;

    public Solution(int N, int[] blacklist) {
        black2white = new HashMap<>();
        r = new Random();
        for(int b:blacklist) black2white.put(b, -1);
        actual = N-black2white.size();
        for(int b:black2white.keySet()){
            // number greater than actual in blacklist will never be chosen
            if(b<actual){
                // notice, not include N
                while(black2white.containsKey(N-1)) N--;
                black2white.put(b, N-1);
                N--;
            }
        }
    }
    
    public int pick() {
        int next = r.nextInt(actual);
        if(black2white.containsKey(next)) return black2white.get(next);
        return next;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(N, blacklist);
 * int param_1 = obj.pick();
 */
