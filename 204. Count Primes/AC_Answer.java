//while do the loop, calculate all multiple of cur_elem
class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        int count = 0;
        for(int i =2; i< n; i++){
            if(!prime[i]) count++;
            for(int j = 2; i*j<n; j++){
                prime[i*j] = true;
            }
        }
        return count;
    }
}
