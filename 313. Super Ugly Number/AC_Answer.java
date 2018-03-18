class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if(n==1) return 1;
        int[] indexes = new int[primes.length];
        List<Integer> res = new ArrayList<>();
        res.add(1);
        while(res.size()<n){
            int find = Integer.MAX_VALUE;
            for(int i=0; i<primes.length; i++){
                find = Math.min(find, primes[i]*res.get(indexes[i]));
            }
            for(int i=0; i<primes.length; i++){
                if(primes[i]*res.get(indexes[i])==find) indexes[i]++;
            }
            res.add(find);
        }
        return res.get(res.size()-1);
    }
}
